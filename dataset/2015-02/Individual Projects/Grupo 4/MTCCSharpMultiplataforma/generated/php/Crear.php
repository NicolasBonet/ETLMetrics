<!DOCTYPE html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<base href="/">
	<title>Estudiantes</title>
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
	<script type="text/javascript">
		$(document).on('ready', function(){
			$("#Crear").click(function(){
				var Id=$('#Id').val();
				var Nombre=$('#Nombre').val();
				var Apellido=$('#Apellido').val();
				var Sexo=$('#Sexo').val();
				var Ciudad=$('#Ciudad').val();
				var Correo=$('#Correo').val();
				var Usuario=$('#Usuario').val();
				var Contrasenia=$('#Contrasenia').val();
				var AcercaDeMi=$('#AcercaDeMi').val();
				var Razon=$('#Razon').val();
				var RecibirCorreo=$('#RecibirCorreo').val();
				$.ajax({
           		       url: '/prueba/Crearapi.php',
			           type: 'POST',
			           data:{
						Id: Id,						Nombre: Nombre,						Apellido: Apellido,						Sexo: Sexo,						Ciudad: Ciudad,						Correo: Correo,						Usuario: Usuario,						Contrasenia: Contrasenia,						AcercaDeMi: AcercaDeMi,						Razon: Razon,						RecibirCorreo: RecibirCorreo			           },
			           success: function(resp)
			           {
			                console.log('enviado el objeto');
			                console.log(resp);

			           }
         			});
    				return false; 
 			});		
 		});
 	</script>  
</head>
<body >
	<div class="container">
    	<center><h1>Crear Usuario</h1></center>
    	<div class="row" >
        <div class="col-sm-offset-4 col-sm-4">
           	<form>
				<div class="form-group">
					<label class="required">Nombre</label>
					<input type="text" id="Nombre" class="form-control" placeholder="Nombre" required  >
				</div>
				<div class="form-group">
					<label >Apellido</label>
					<input type="text" id="Apellido" class="form-control" placeholder="Apellido"  >
				</div>
				<div class="form-group">
                   	<label class="required">Sexo</label>
                   	<div>
                		<label class="radio-inline">
                    		<input type="radio" id="Sexo" value="0" > Mujer 
                		</label>
                		<label class="radio-inline">
                    		<input type="radio" id="Sexo" value="1" > Hombre 
                		</label>
                    </div>
                </div>
					<div class="form-group">
                    	<label class="required">Ciudad</label>
                    	<select name="Ciudad">
                    	<?php		
							$url = file_get_contents("http://192.168.0.6:51792/api/Ciudades/ObtenerTodos");
							$array = json_decode($url,true);
							foreach ($array as $resp) 
							{
								echo '<option value="..objeto..">'.$resp['Nombre'].'</option>';
							} 
						?>
	
		    				
		  				</select>
                	</div>
				<div class="form-group">
					<label >Correo</label>
					<input type="email" id="Correo" class="form-control" placeholder="Correo"  >
				</div>
				<div class="form-group">
					<label class="required">Usuario</label>
					<input type="text" id="Usuario" class="form-control" placeholder="Usuario" required  >
				</div>
				<div class="form-group">
					<label class="required">Contrasenia</label>
					<input type="password" id="Contrasenia" class="form-control" placeholder="Contrasenia" required  >
				</div>
					<div class="form-group">
                    	<label class="required">Acerca de mi</label>
                    	<textarea id="AcercaDeMi" class="form-control" rows="10" ></textarea>
                	</div>
					<div class="form-group">
                    	<label >¿Por qué estudiar en los Andes?</label>
                    	<textarea id="Razon" class="form-control" rows="10" ></textarea>
                	</div>
				<div class="checkbox">
	            	<label>
	                	<input type="checkbox" id="RecibirCorreo"
> ¿Desea recibir correo elecrónico?
	                </label>
	            </div>
					<br>         
                	<button type="submit" id="Crear">Crear</button>
			</form>
		</div>
    </div>
</div>
</body>
</html>
