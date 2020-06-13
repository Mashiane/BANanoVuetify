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
	Public const FILE_WRITE As String = "WriteFile"
	Public const FILE_LOG As String = "LogFile"
	Public const FILE_APPEND As String = "FileAppend"
	Public const FILE_COPY As String = "FileCopy"
	Public const FILE_RENAME As String = "FileRename"
	Public const FILE_DELETE As String = "FileDelete"
	Public const DIRECTORY_MAKE As String = "DirectoryMake"
	Public const FILE_GETHTML As String = "FileGetHTML"
	Public const FILE_GETJSON As String = "FileGetJSON"
	Public const DIRECTORY_ZIP As String = "DirectoryZip"
	Public const DIRECTORY_DELETE As String = "DirectoryDelete"
	Public const DIRECTORY_LISTRECURSIVE As String = "DirectoryListRecursive"
	Public const FILE_UNZIP As String = "FileUnzip"
	Public const DIRECTORY_COPY As String = "DirectoryCopy"
	Public const EXCEL_TEST As String = "ExcelTest"
	Type BANAnoPHPDirList(dnum As Int, fnum As Int, dirs As List, files As List)
End Sub

Sub Initialize As BANanoPHP
	Return Me
End Sub

'get the directly structure from php call
Sub GetDirectoryList(sout As String) As BANAnoPHPDirList
	'initialize the structure
	Dim DIR As BANAnoPHPDirList
	DIR.initialize
	DIR.dirs.initialize
	DIR.dnum = 0
	DIR.fnum = 0
	DIR.files.Initialize
	'
	If sout.startswith("{") Then
		Dim soutm As Map = BANano.fromjson(sout)
		DIR.dnum = soutm.get("dnum")
		DIR.fnum = soutm.get("fnum")
		DIR.files = soutm.get("files")
		DIR.dirs = soutm.get("dirs")	
	End If
	Return DIR
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

'build the code to get the contents
Sub BuildFileGetHTML(url As String) As Map
	Dim se As Map = CreateMap()
	se.put("url", url)
	Return se
End Sub

'build the code to get the contents
Sub BuildFileGetJSON(url As String) As Map
	Dim se As Map = CreateMap()
	se.put("url", url)
	Return se
End Sub


'build the code to write contents to file, will overwite
Sub BuildWriteFile(fileName As String, fileContents As String) As Map
	Dim se As Map = CreateMap()
	se.Put("fileName", fileName)
	se.Put("fileContents", fileContents)
	Return se
End Sub

'build code to copy the files
Sub BuildFileCopy(source As String, target As String) As Map
	Dim se As Map = CreateMap()
	se.Put("source", source)
	se.Put("target", target)
	Return se
End Sub

'build code to rename the files
Sub BuildFileRename(source As String, target As String) As Map
	Dim se As Map = CreateMap()
	se.Put("source", source)
	se.Put("target", target)
	Return se
End Sub

'build the directory listing
Sub BuildDirectoryList(path As String) As Map
	Dim se As Map = CreateMap()
	se.put("path", path)
	Return se
End Sub

'build the file unzip
Sub BuildFileUnzip(zipfile As String, extractTo As String) As Map
	Dim se As Map = CreateMap()
	se.put("zipfile", zipfile)
	se.Put("extractTo", extractTo)
	Return se
End Sub


'build the directory zip
Sub BuildDirectoryZip(path As String, zipname As String) As Map
	Dim se As Map = CreateMap()
	se.put("path", path)
	se.Put("zipname", zipname)
	Return se
End Sub

'build the file to delete
Sub BuildFileDelete(filex As String) As Map
	Dim se As Map = CreateMap()
	se.put("filex", filex)
	Return se
End Sub

'build the directory make
Sub BuildDirectoryMake(dirPath As String) As Map
	Dim se As Map = CreateMap()
	se.put("dirpath", dirPath)
	Return se
End Sub

'build the directory delete
Sub BuildDirectoryDelele(dirPath As String) As Map
	Dim se As Map = CreateMap()
	se.put("dir", dirPath)
	Return se
End Sub

'build the directory recursive listing
Sub BuildDirectoryListRecursive(dirPath As String) As Map
	Dim se As Map = CreateMap()
	se.put("path", dirPath)
	Return se
End Sub

'build directory copy
Sub BuildDirectoryCopy(src As String, dst As String) As Map
	Dim se As Map = CreateMap()
	se.put("src", src)
	se.put("dst", dst)
	Return se
End Sub


#if PHP

/**
* FlxZipArchive, Extends ZipArchiv.
* Add Dirs with Files and Subdirs.
*
* <code>
*  $archive = new FlxZipArchive;
*  // .....
*  $archive->addDir( 'test/blub', 'blub' );
* </code>
*/
class FlxZipArchive extends ZipArchive {
    /**
     * Add a Dir with Files and Subdirs to the archive
     *
     * @param string $location Real Location
     * @param string $name Name in Archive
     * @author Nicolas Heimann
     * @access private
     **/

    public function addDir($location, $name) {
        $this->addEmptyDir($name);

        $this->addDirDo($location, $name);
     } // EO addDir;

    /**
     * Add Files & Dirs to archive.
     *
     * @param string $location Real Location
     * @param string $name Name in Archive
     * @author Nicolas Heimann
     * @access private
     **/

    private function addDirDo($location, $name) {
        $name .= '/';
        $location .= '/';

        // Read all Files in Dir
        $dir = opendir ($location);
        while ($file = readdir($dir))
        {
            if ($file == '.' || $file == '..') continue;

            // Rekursiv, If dir: FlxZipArchive::addDir(), else ::File();
            $do = (filetype( $location . $file) == 'dir') ? 'addDir' : 'addFile';
            $this->$do($location . $file, $name . $file);
        }
    } // EO addDirDo();
}

function DirectoryCopy($src, $dst) {  
    // open the source directory 
    $dir = opendir($src);  
    // Make the destination directory if not exist 
    @mkdir($dst);  
    // Loop through the files in source directory 
    foreach (scandir($src) as $file) {  
        if (( $file != '.' ) && ( $file != '..' )) {  
            if ( is_dir($src . '/' . $file) )  
            {  
                // Recursively calling custom copy function 
                // for sub directory  
                DirectoryCopy($src . '/' . $file, $dst . '/' . $file);  
            }  
            else {  
                copy($src . '/' . $file, $dst . '/' . $file);  
            }  
        }  
    }  
    closedir($dir); 
}   

function FileUnzip($zipfile, $extractTo) {
	// Create new zip class 
	$zip = new ZipArchive; 
	$zip->open($zipfile); 
	// Extracts to current directory 
	$zip->extractTo($extractTo); 
	$zip->close();  
}


function DirectoryListRecursive($path) {
	$iterator = new RecursiveDirectoryIterator($path);
    // skip dot files while iterating 
    $iterator->setFlags(RecursiveDirectoryIterator::SKIP_DOTS);
	$rii = new RecursiveIteratorIterator($iterator, RecursiveIteratorIterator::SELF_FIRST);

    $files = array(); 
    foreach ($rii as $file) {
	   	$fname = $file->getPathname();
		$fname = str_replace('\\', '/', $fname);
		$files[] = $fname;
	}
		
    $output = json_encode($files);
    echo($output);
}

function DirectoryDelete($dir) {
	$iter = new RecursiveDirectoryIterator($dir);
	foreach (new RecursiveIteratorIterator($iter, RecursiveIteratorIterator::CHILD_FIRST) as $f) {
		if ($f->isDir()) {
			rmdir($f->getPathname());
		} else {
			unlink($f->getPathname());
		}
	}
	rmdir($dir);
}


function DirectoryZip($path, $zipname) {
	$za = new FlxZipArchive;
	$res = $za->open($zipname, ZipArchive::CREATE);
	if($res === TRUE) {
    	$za->addDir($path, basename($path));
    	$za->close();
	}
}

function FileGetJSON($url) {
	$f = file_get_contents($url);
	echo $f;
}


function FileGetHTML($url) {
	$f = file_get_contents($url);
	echo $f;
}

function DirectoryMake($dirpath) {
	mkdir($dirpath, 0700, true);
}

function FileDelete($filex) {
	if (file_exists($filex)) {
		unlink($filex);
	}
}

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

function WriteFile($fileName, $fileContents) {
	file_put_contents($fileName, $fileContents);
}

function LogFile($fileName, $fileContents) {
	$msg = date("Y-m-d H:i:s ") . $fileContents . "\n";
	file_put_contents($fileName, $msg, FILE_APPEND);
}

function FileAppend($fileName, $fileContents) {
	file_put_contents($fileName, $fileContents, FILE_APPEND);
}

function FileCopy($source, $target) {
	copy($source, $target);
}

function FileRename($source, $target) {
	rename($source, $target);
}

function GetFile($fileName) {
	$f = file_get_contents($fileName);
	echo $f;
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