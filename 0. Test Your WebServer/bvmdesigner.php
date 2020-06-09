<?php header("Access-Control-Allow-Origin: *");$rest_json = file_get_contents("php://input");$_POST = json_decode($rest_json, true);$request='';if(isset($_POST['request'])){$request = $_POST['request'];$params = $_POST['params'];}if (!function_exists($request)) die("invalid request: '" . $request . "'"); 
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
 
 
function BANanoMSSQL($command, $query, $args, $types){ 
	$resp = array(); 
	header('Access-Control-Allow-Origin: *'); 
	header('content-type: application/json; charset=utf-8'); 
	require_once './assets/config.php'; 
	$serverName = DB_HOST; 
	$uid = DB_USER; 
	$pwd = DB_PASS; 
	$database = DB_NAME; 
	try { 
		$conn = new PDO("sqlsrv:server=$serverName;database=$database", $uid, $pwd); 
 		$conn->setAttribute(PDO::ATTR_EMULATE_PREPARES, false); 
		$conn->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_ASSOC); 
		$conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION ); 
		$conn->setAttribute(PDO::SQLSRV_ATTR_DIRECT_QUERY, true); 
		 
    	$commands = array('delete', 'update', 'replace', 'insert', 'connection', 'createdb', 'dropdb', 'createtable', 'droptable'); 
    	if (in_array($command, $commands)) { 
        	$command = 'changes'; 
    	} 
		switch ($command) { 
    	case "changes": 
        	$stmt = $conn->prepare($query); 
			$stmt->execute($args); 
			$affRows = $stmt->rowCount(); 
			 
			$resp['response'] = "Success"; 
			$resp['error'] = ''; 
			$resp['result'] = array(); 
			$resp['affectedRows'] = $affRows; 
			$output = json_encode($resp); 
        	break; 
    	default: 
			$stmt = $conn->prepare($query); 
			$stmt->execute($args); 
			$rows = $stmt->fetchAll(); 
        	$affRows = $stmt->rowCount(); 
			$resp['response'] = "Success"; 
			$resp['error'] = ''; 
			$resp['result'] = $rows; 
			$resp['affectedRows'] = $affRows; 
			$output = json_encode($resp); 
        	break; 
		} 
    	echo ($output); 
		// Free statement and connection resources. 
		$stmt = null; 
		$conn = null; 
	} catch( PDOException $e ) { 
		$response = $e->getMessage(); 
		$resp['response'] = "Error"; 
		$resp['error'] = $response; 
		$resp['result'] = array(); 
		$output = json_encode($resp); 
        die($output); 
	} 
} 
 
function BANanoMSSQLDynamic($command, $query, $args, $types, $host, $username, $password, $dbname){ 
	$resp = array(); 
	header('Access-Control-Allow-Origin: *'); 
	header('content-type: application/json; charset=utf-8'); 
	$conn=null; 
	try { 
		$conn = new PDO("sqlsrv:server=$host;database=$dbname", $username, $password); 
 		$conn->setAttribute(PDO::ATTR_EMULATE_PREPARES, false); 
		$conn->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_ASSOC); 
		$conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION ); 
		$conn->setAttribute(PDO::SQLSRV_ATTR_DIRECT_QUERY, true); 
		 
    	$commands = array('delete', 'update', 'replace', 'insert', 'connection', 'createdb', 'dropdb', 'createtable', 'droptable'); 
    	if (in_array($command, $commands)) { 
        	$command = 'changes'; 
    	} 
		switch ($command) { 
    	case "changes": 
        	$stmt = $conn->prepare($query); 
			$stmt->execute($args); 
			$affRows = $stmt->rowCount(); 
			 
			$resp['response'] = "Success"; 
			$resp['error'] = ''; 
			$resp['result'] = array(); 
			$resp['affectedRows'] = $affRows; 
			$output = json_encode($resp); 
        	break; 
    	default: 
			$stmt = $conn->prepare($query); 
			$stmt->execute($args); 
			$rows = $stmt->fetchAll(); 
        	$affRows = $stmt->rowCount(); 
			$resp['response'] = "Success"; 
			$resp['error'] = ''; 
			$resp['result'] = $rows; 
			$resp['affectedRows'] = $affRows; 
			$output = json_encode($resp); 
        	break; 
		} 
    	echo ($output); 
		// Free statement and connection resources. 
		$stmt = null; 
		$conn = null; 
	} catch( PDOException $e ) { 
		$response = $e->getMessage(); 
		$resp['response'] = "Error"; 
		$resp['error'] = $response; 
		$resp['result'] = array(); 
		$output = json_encode($resp); 
        die($output); 
	} 
} 
 
 
function prepareMySQL($conn, $query, $types, $args) { 
	//paramater types to execute 
	/* Bind parameters. Types: s = string, i = integer, d = double,  b = blob */ 
	$stmt = $conn->prepare($query); 
	if(is_array($types)){ 
		$a_params = array(); 
		$param_type = ''; 
		$n = count($types); 
		for($i = 0; $i < $n; $i++) { 
			$param_type .= $types[$i]; 
		} 
		$a_params[] = & $param_type; 
		//values to execute 
		for($i = 0; $i < $n; $i++) { 
			$a_params[] = & $args[$i]; 
		} 
		call_user_func_array(array($stmt, 'bind_param'), $a_params); 
	} 
	return $stmt; 
} 
 
function BANanoMySQL($command, $query, $args, $types) { 
	$resp = array(); 
	header('Access-Control-Allow-Origin: *'); 
	header('content-type: application/json; charset=utf-8'); 
	require_once './assets/config.php'; 
    //connect To MySQL 
    $conn = new mysqli(DB_HOST, DB_USER, DB_PASS, DB_NAME); 
    //we cannot connect Return an error 
    if ($conn->connect_error) { 
        $response = $conn->connect_error; 
        $resp['response'] = "Error"; 
		$resp['error'] = $response; 
		$resp['result'] = array(); 
		$output = json_encode($resp); 
        die($output); 
    } 
    mysqli_set_charset($conn, 'utf8'); 
    //$query = mysqli_real_escape_string($conn, $query); 
    $commands = array('delete', 'update', 'replace', 'insert', 'connection', 'createdb', 'dropdb', 'createtable', 'droptable'); 
    if (in_array($command, $commands)) { 
        $command = 'changes'; 
    } 
    switch ($command) { 
    case "changes": 
        $stmt = prepareMySQL($conn, $query, $types, $args); 
        if (! $stmt -> execute()) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
	 
		$affRows = $conn->affected_rows; 
    	$resp['response'] = "Success"; 
		$resp['error'] = ''; 
		$resp['result'] = array(); 
		$resp['affectedRows'] = $affRows; 
		$output = json_encode($resp); 
        break; 
    default: 
        $stmt = prepareMySQL($conn, $query, $types, $args); 
        //$result = $stmt->execute(); 
		//$result = $stmt->get_result(); 
         
		if (!($result = $stmt->execute())) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
		 
		if (!($result = $stmt->get_result())) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
		 
		$affRows = $conn->affected_rows; 
    	$rows = array(); 
        while ($row = $result->fetch_assoc()) { 
            $rows[] = $row; 
        } 
    	$resp['response'] = "Success"; 
		$resp['error'] = ''; 
		$resp['result'] = $rows; 
		$resp['affectedRows'] = $affRows; 
		$output = json_encode($resp); 
        break; 
	} 
	echo ($output); 
    $stmt->close(); 
    $conn->close(); 
} 
 
function BANanoMySQLDynamic($command, $query, $args, $types, $host, $username, $password, $dbname) { 
	$resp = array(); 
	header('Access-Control-Allow-Origin: *'); 
	header('content-type: application/json; charset=utf-8'); 
	//connect To MySQL 
    $conn = new mysqli($host, $username, $password); 
    //we cannot connect Return an error 
    if ($conn->connect_error) { 
        $response = $conn->connect_error; 
        $resp['response'] = "Error"; 
		$resp['error'] = $response; 
		$resp['result'] = array(); 
		$output = json_encode($resp); 
        die($output); 
    } 
	//select the database 
	mysqli_set_charset($conn, 'utf8'); 
    $commands = array('delete', 'update', 'replace', 'insert', 'createtable', 'droptable'); 
    if (in_array($command, $commands)) { 
        $command = 'changes'; 
    } 
    switch ($command) { 
    case "connection": 
		$resp['response'] = "Success"; 
		$resp['error'] = ''; 
		$resp['result'] = array(); 
		$resp['affectedRows'] = 0; 
		$output = json_encode($resp); 
		die($output); 
	case "createdb": 
		$stmt = prepareMySQL($conn, $query, $types, $args); 
        if (! $stmt -> execute()) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
	 
		$resp['response'] = "Success"; 
		$resp['error'] = ''; 
		$resp['result'] = array(); 
		$resp['affectedRows'] = 0; 
		$output = json_encode($resp); 
        break; 
	case "dropdb": 
		$stmt = prepareMySQL($conn, $query, $types, $args); 
        if (! $stmt -> execute()) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
	 
		$resp['response'] = "Success"; 
		$resp['error'] = ''; 
		$resp['result'] = array(); 
		$resp['affectedRows'] = 0; 
		$output = json_encode($resp); 
        break; 
	case "databases": 
		$stmt = prepareMySQL($conn, $query, $types, $args); 
        if (!($result = $stmt->execute())) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
		 
		if (!($result = $stmt->get_result())) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
		 
		$affRows = $conn->affected_rows; 
    	$rows = array(); 
        while ($row = $result->fetch_assoc()) { 
            $rows[] = $row; 
        } 
    	$resp['response'] = "Success"; 
		$resp['error'] = ''; 
		$resp['result'] = $rows; 
		$resp['affectedRows'] = $affRows; 
		$output = json_encode($resp); 
        break; 
	case "changes": 
		//select the db before processing 
		$selected = mysqli_select_db($conn, $dbname); 
		if (!$selected) { 
			$response = $conn->connect_error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
        	die($output); 
		} 
        $stmt = prepareMySQL($conn, $query, $types, $args); 
        if (! $stmt -> execute()) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
	 
		$affRows = $conn->affected_rows; 
    	$resp['response'] = "Success"; 
		$resp['error'] = ''; 
		$resp['result'] = array(); 
		$resp['affectedRows'] = $affRows; 
		$output = json_encode($resp); 
        break; 
    default: 
		//select the db before processing 
		$dbname = mysqli_real_escape_string($conn, $dbname); 
		$selected = mysqli_select_db($conn, $dbname); 
		if (!$selected) { 
			$response = $conn->connect_error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
        	die($output); 
		} 
        $stmt = prepareMySQL($conn, $query, $types, $args); 
        //$result = $stmt->execute(); 
		//$result = $stmt->get_result(); 
         
		if (!($result = $stmt->execute())) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
		 
		if (!($result = $stmt->get_result())) { 
			$response = $stmt->error; 
        	$resp['response'] = "Error"; 
			$resp['error'] = $response; 
			$resp['result'] = array(); 
			$output = json_encode($resp); 
	        die($output); 
		} 
		 
		$affRows = $conn->affected_rows; 
    	$rows = array(); 
        while ($row = $result->fetch_assoc()) { 
            $rows[] = $row; 
        } 
    	$resp['response'] = "Success"; 
		$resp['error'] = ''; 
		$resp['result'] = $rows; 
		$resp['affectedRows'] = $affRows; 
		$output = json_encode($resp); 
        break; 
	} 
	echo ($output); 
    $stmt->close(); 
    $conn->close(); 
} 
 
function preparesqlite($db, $sql, $types, $values) { 
		/* Bind parameters. Types: s = string, i = integer, d = double,  b = blob */ 
		$stmt = $db->prepare($sql); 
		if(is_array($types)){ 
			$n = count($types); 
			for($i = 0; $i < $n; $i++) { 
				$param_type = $types[$i]; 
				$param_value = $values[$i]; 
				$loc = $i + 1; 
				switch($param_type){ 
					case "s": 
						$stmt->bindValue($loc, $param_value, SQLITE3_TEXT); 
						break; 
					case "i": 
						$stmt->bindValue($loc, $param_value, SQLITE3_INTEGER); 
						break; 
					case "d": 
						$stmt->bindValue($loc, $param_value, SQLITE3_FLOAT); 
						break; 
					case "b": 
						$stmt->bindValue($loc, $param_value, SQLITE3_BLOB); 
						break; 
				} 
			} 
		} 
		return $stmt; 
} 
 
function BANanoSQLite($dbname,$command,$query,$args,$types) { 
	$db; 
   	//set the header 
	header('Access-Control-Allow-Origin: *'); 
	header('content-type: application/json; charset=utf-8'); 
   	$db = new SQLite3($dbname, SQLITE3_OPEN_CREATE | SQLITE3_OPEN_READWRITE); 
	if(!$db) { 
  		$response = $db->lastErrorMsg(); 
  		$rows = Array(); 
		$rows[] = $response; 
		$output = json_encode($rows); 
	  	die($output); 
	} 
	$commands = array('delete', 'update', 'replace', 'insert', 'createtable', 'droptable'); 
	if(in_array($command,$commands)) { 
    	$command = 'changes'; 
	} 
	switch($command){ 
		case "changes": 
			try { 
			 $stmt = preparesqlite($db, $query, $types, $args); 
			 $res = $stmt->execute(); 
			 $changes = $db->changes(); 
			 $rows = Array(); 
			 $rows[] = $changes; 
			 $res->finalize(); 
			 $resp['response'] = "Success"; 
			 $resp['error'] = ''; 
			 $resp['result'] = $rows; 
			 $resp['affectedRows'] = $changes; 
			 $output = json_encode($resp); 
	  		 echo $output; 
			 break; 
			} 
			catch (Exception $e) { 
			 $error = $e->getMessage(); 
			 $resp['response'] = "Error"; 
			 $resp['error'] = $response; 
			 $resp['result'] = array(); 
			 $output = json_encode($resp); 
	         die($output); 
			} 
	   	default: 
		    try { 
			$stmt = preparesqlite($db, $query, $types, $args); 
			$res = $stmt->execute(); 
			$changes = $db->changes(); 
			$rows = Array(); 
			while($row = $res->fetchArray(1)) { 
				$rows[] = $row; 
			} 
			$res->finalize(); 
			$resp['response'] = "Success"; 
			$resp['error'] = ''; 
			$resp['result'] = $rows; 
			$resp['affectedRows'] = $changes; 
			$output = json_encode($resp); 
	  		echo $output; 
			break; 
			} 
			catch (Exception $e) { 
			 $error = $e->getMessage(); 
			 $resp['response'] = "Error"; 
			 $resp['error'] = $response; 
			 $resp['result'] = array(); 
			 $output = json_encode($resp); 
	         die($output); 
			} 
	} 
	$db->close(); 
} 
$values = array_values($params);call_user_func_array($request, $values);?>