<?php
	set_time_limit(0);
	$DBhost = "localhost";
	$DBuser = "root";
	$DBpass = "123456";
	$DBname = "sistemaclinica";
	header("Content-type: text/html;charset=utf-8");
	$dsn = "mysql:host=$DBhost;dbname=$DBname;charset=utf8";
	$opcoes = array(
		PDO::MYSQL_ATTR_INIT_COMMAND => 'SET NAMES UTF8'
	);
 
	try{
		//$DBcon = new PDO("mysql:host=$DBhost;dbname=$DBname",$DBuser,$DBpass);
		$DBcon = new PDO($dsn, $DBuser, $DBpass, $opcoes);
		$DBcon->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
	}catch(PDOException $ex){
		die($ex->getMessage());
}
/*
Pegar as empresas 
$query = "SELECT id_empresa, cnpj, nome_fantasia, endereco, telefone FROM sistemaclinica.empresa where id_empresa > 2050000 LIMIT 200000;";
*/

/*
Pegar o tempo
$query = "SELECT data_realizacao FROM sistemaclinica.exame where id_exame > 350000 LIMIT 50000;";
*/

/*
$query = "SELECT exame.id_exame, exame.especialidade, t.tipo
		  FROM sistemaclinica.exame exame
		  INNER JOIN sistemaclinica.tipo_exame t ON exame.tipo_exame_id_tipo_exame = t.id_tipo_exame
		  WHERE exame.id_exame > 350000
		  ORDER BY exame.id_exame
		  LIMIT 50000;";
Pegar os exames
*/

$stmt = $DBcon->prepare($query);
$stmt->execute();

//Variáveis auxiliares
$userData = array();
$count_tempo = 350007;
$count_empresa = 350001;

while($row=$stmt->fetch(PDO::FETCH_ASSOC)){
    /*
	Criar insert de empresa
	$query = "INSERT INTO `dwclinica`.`empresa` (`idempresa`, `cnpj`, `nomefantasia`, `endereco`, `telefone`) VALUES (".$row["id_empresa"].", '".$row["cnpj"]."', '".$row["nome_fantasia"]."', '".$row["endereco"]."', '".$row["telefone"]."');";
	*/
	
	/*
	Criar insert de tempo
	$userData[] = $row;
	$userData = explode('-', $row["data_realizacao"]);
	$query = "INSERT INTO `dwclinica`.`tempo` (`ano`, `mes`, `dia`) VALUES (".$userData[0].", ".$userData[1].", ".$userData[2].");";
	*/
	
	/*
	Criar insert de exame
	$query = "INSERT INTO `dwclinica`.`exame` (`idexame`, `idempresa`, `idtempo`, `especialidade`, `quantidade`, `tipo`) VALUES (".$row["id_exame"].", ".$count_empresa.", ".$count_tempo.", '".$row["especialidade"]."', 1, '".$row["tipo"]."');";
	*/
	
	//Mudar nome do arquivo
	file_put_contents('exame_8.sql', $query, FILE_APPEND);
	$count_tempo++;
	$count_empresa++;
}

?>
