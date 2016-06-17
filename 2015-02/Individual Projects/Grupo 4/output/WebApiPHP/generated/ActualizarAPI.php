<?php
extract($_POST);
$Id=$_POST['Id'];
$Nombre=$_POST['Nombre'];
$Apellido=$_POST['Apellido'];
$Sexo=$_POST['Sexo'];
$Ciudad=$_POST['Ciudad'];
$Correo=$_POST['Correo'];
$Usuario=$_POST['Usuario'];
$Contrasenia=$_POST['Contrasenia'];
$AcercaDeMi=$_POST['AcercaDeMi'];
$Razon=$_POST['Razon'];
$RecibirCorreo=$_POST['RecibirCorreo'];
	
$vars = array("Id","Nombre","Apellido","Sexo","Ciudad","Correo","Usuario","Contrasenia","AcercaDeMi","Razon","RecibirCorreo");
$data = compact( $vars);                                                       
$obj = json_encode($data); 
$ch=curl_init("http://192.168.0.6:51792/api/EstudiantesActualizar");
curl_setopt_array($ch, array(
    CURLOPT_POST => TRUE,
    CURLOPT_RETURNTRANSFER => TRUE,
    CURLOPT_HTTPHEADER => array(
        'Content-Type: application/json'
    ),
    CURLOPT_POSTFIELDS => $obj
));
// Send the request
$response = curl_exec($ch);
// Check for errors
if($response === FALSE){
    die(curl_error($ch));
}
// Decode the response
$responseData = json_decode($response, TRUE);
// Print the date from the response
echo $responseData['published'];
?>