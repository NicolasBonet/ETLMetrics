app.controller('EstudiantesActualizarController', function($scope, $state, $stateParams, Ciudades, Estudiantes) {
	
	$scope.titulo = 'Actualizar estudiante';
	
	invokeService(Estudiantes.ObtenerPorId($stateParams.id).then(function(response){
        $scope.EstudianteDTO = response.data;
    }));    

	invokeService(Ciudades.ObtenerTodos().then(function(response){
        $scope.Ciudades = response.data;
    }));
	
	$scope.submit = function(){
        invokeService(Estudiantes.Actualizar($scope.EstudianteDTO).then(function(response){
            alert("EstudianteDTO modificado exitósamente");
        }));
    }
});