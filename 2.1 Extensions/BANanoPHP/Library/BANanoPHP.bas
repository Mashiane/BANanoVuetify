B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#ignorewarnings:12
Sub Class_Globals
	Private BANano As BANano   'ignore
	Public CONST SEND_EMAIL As String = "SendEmail"
	Public Const GET_FILE As String = "GetFile"
	Public Const DIRECTORY_LIST As String = "DirectoryList"
	Public const ROLLING_COPYRIGHT As String = "RollingCopyright"
	Public const VALIDATE_CC As String = "ValidateCC"
	Public const FILE_EXISTS As String = "FileExists"
	Type BANAnoPHPDirList(dnum As Int, fnum As Int, dirs As List, files As List)
End Sub

Sub Initialize As BANanoPHP
	Return Me
End Sub

'get the directly structure from php call
Sub GetDirectoryList(sout As String) As BANAnoPHPDirList
	'initialize the structure
	Dim dir As BANAnoPHPDirList
	dir.initialize
	dir.dirs.initialize
	dir.dnum = 0
	dir.fnum = 0
	dir.files.Initialize
	'
	If sout.startswith("{") Then
		Dim soutm As Map = BANano.fromjson(sout)
		dir.dnum = soutm.get("dnum")
		dir.fnum = soutm.get("fnum")
		dir.files = soutm.get("files")
		dir.dirs = soutm.get("dirs")	
	End If
	Return dir
End Sub

'rolling copyright
Sub BuildRollingCopyright(message As String, year As String) As Map
	Dim se As Map = CreateMap()
	se.put("message", message)
	se.put("year", year)
	Return se
End Sub

'build file exists
Sub BuildFileExists(path As String) As Map
	Dim se As Map = CreateMap()
	se.Put("path", path)
	Return se
End Sub

'validate cc
Sub BuildValidateCC(number As String, expiry As String) As Map
	Dim se As Map = CreateMap()
	se.put("number", number)
	se.put("expiry", expiry)
	Return se
End Sub

'build code to send email
Sub BuildSendEmail(fromEmail As String, toEmail As String, ccEmail As String, subject As String, message As String) As Map
	Dim se As Map = CreateMap()
	se.put("from", fromEmail)
	se.put("to", toEmail)
	se.put("cc", ccEmail)
	se.put("subject", subject)
	se.put("msg", message)
	Return se
End Sub

'build the code to get the contents
Sub BuildGetFile(fileName As String) As Map
	Dim se As Map = CreateMap()
	se.put("fileName", fileName)
	Return se
End Sub

'build the directory listing
Sub BuildDirectoryList(path As String) As Map
	Dim se As Map = CreateMap()
	se.put("path", path)
	Return se
End Sub

#if PHP
function FileExists($path) {
	if (file_exists($path)) {
    	echo "yes";
    }else {
        echo "no";
    }
}

function RollingCopyright($message,$year)
{
  echo("$message &copy;$year-" . date("Y"));
}


function GetFile($fileName) {
	echo file_get_contents($fileName);
}

function SendEmail($from,$to,$cc,$subject,$msg) { 
    $msg = str_replace("|", "\r\n", $msg);
	$msg = str_replace("\n.", "\n..", $msg); 
	// use wordwrap() if lines are longer than 70 characters 
	$msg = wordwrap($msg,70,"\r\n"); 
	//define from header 
	$headers = "From:" . $from . "\r\n"; 
	$headers .= "Cc: " . $cc . "\r\n"; 
	$headers .= "X-Mailer:PHP/" . phpversion(); 
	// send email 
	$response = (mail($to,$subject,$msg,$headers)) ? "success" : "failure"; 
    $output = json_encode(array("response" => $response)); 
    header('content-type: application/json; charset=utf-8'); 
    echo($output); 
} 

function DirectoryList($path) {
	$files = array();
	$dirs = array();
	$fnum = $dnum = 0;
	if (is_dir($path)) 
   { 
      $dh = opendir($path); 
      do 
      { 
         $item = readdir($dh); 
         if ($item !== FALSE && $item != "." && $item != "..")
         { 
            if (is_dir("$path/$item")) $dirs[$dnum++] = $item; 
            else $files[$fnum++] = $item; 
         } 
      } while($item !== FALSE);    
      closedir($dh); 
   }  
   $resp['dnum'] = $dnum;
   $resp['fnum'] = $fnum;
   $resp['dirs'] = $dirs;
   $resp['files'] = $files;
   $output = json_encode($resp);
   echo($output);
}

function ValidateCC($number, $expiry) 
{ 
   $ccnum  = preg_replace('/[^\d]/', '', $number); 
   $expiry = preg_replace('/[^\d]/', '', $expiry); 
   $left   = substr($ccnum, 0, 4); 
   $cclen  = strlen($ccnum); 
   $chksum = 0; 
 
   // Diners Club 
   if (($left >= 3000) && ($left <= 3059) || 
       ($left >= 3600) && ($left <= 3699) || 
       ($left >= 3800) && ($left <= 3889)) 
      if ($cclen != 14) die(FALSE); 
 
   // JCB 
   if (($left >= 3088) && ($left <= 3094) || 
       ($left >= 3096) && ($left <= 3102) || 
       ($left >= 3112) && ($left <= 3120) || 
       ($left >= 3158) && ($left <= 3159) || 
       ($left >= 3337) && ($left <= 3349) || 
       ($left >= 3528) && ($left <= 3589)) 
      if ($cclen != 16) die(FALSE); 
 
   // American Express 
   elseif (($left >= 3400) && ($left <= 3499) || 
           ($left >= 3700) && ($left <= 3799)) 
      if ($cclen != 15) die(FALSE); 
 
   // Carte Blanche 
   elseif (($left >= 3890) && ($left <= 3899)) 
      if ($cclen != 14) die(FALSE); 
 
   // Visa 
   elseif (($left >= 4000) && ($left <= 4999)) 
      if ($cclen != 13 && $cclen != 16) die(FALSE); 
 
   // MasterCard 
   elseif (($left >= 5100) && ($left <= 5599)) 
      if ($cclen != 16) die(FALSE); 
       
   // Australian BankCard 
   elseif ($left == 5610) 
      if ($cclen != 16) die(FALSE); 
 
   // Discover 
   elseif ($left == 6011) 
      if ($cclen != 16) die(FALSE); 
 
   // Unknown 
   else die(FALSE); 
 
   for ($j = 1 - ($cclen % 2); $j < $cclen; $j += 2) 
      $chksum += substr($ccnum, $j, 1); 
 
   for ($j = $cclen % 2; $j < $cclen; $j += 2) 
   { 
      $d = substr($ccnum, $j, 1) * 2; 
      $chksum += $d < 10 ? $d : $d - 9; 
   } 
 
   if ($chksum % 10 != 0) die(FALSE); 
 
   if (mktime(0, 0, 0, substr($expiry, 0, 2), date("t"), 
      substr($expiry, 2, 2)) < time()) die(FALSE); 
    
   die(TRUE); 
}

#End If