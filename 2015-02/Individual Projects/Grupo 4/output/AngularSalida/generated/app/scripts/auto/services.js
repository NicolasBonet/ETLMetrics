app.service('Ciudades', function ($http) {
	
	this.ObtenerTodos = function () {
		return $http.get('http://localhost:51792/api/Ciudades/ObtenerTodos');
	}
});
app.service('Estudiantes', function ($http) {
	
	this.ObtenerPorId = function (id) {
		return $http.get('http://localhost:51792/api/Estudiantes/ObtenerPorId?id=' + id);
	}
	
	this.Crear = function (estudianteDTO) {
		return $http.post('http://localhost:51792/api/Estudiantes/Crear', estudianteDTO);
	}
	
	this.Actualizar = function (estudianteDTO) {
		return $http.put('http://localhost:51792/api/Estudiantes/Actualizar', estudianteDTO);
	}
});