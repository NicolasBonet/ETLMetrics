app.controller('EstudiantesCrearController', function($scope, $state, Ciudades, Estudiantes) {
	
	$scope.titulo = 'Crear estudiante';

	invokeService(Ciudades.ObtenerTodos().then(function(response){
        $scope.Ciudades = response.data;
    }));
	
	$scope.submit = function(){
        invokeService(Estudiantes.Crear($scope.EstudianteDTO).then(function(response){
            alert("EstudianteDTO agregado exitósamente");
        }));
    }
});