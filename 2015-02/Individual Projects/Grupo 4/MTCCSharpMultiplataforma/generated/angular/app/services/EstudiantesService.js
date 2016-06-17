app.service('Estudiantes', function ($http) {
	
	this.ObtenerPorId = function (id) {
		return $http.get('http://192.168.0.6:51792/api/Estudiantes/ObtenerPorId?id=' + id);
	}
	
	this.Crear = function (estudianteDTO) {
		return $http.post('http://192.168.0.6:51792/api/Estudiantes/Crear', estudianteDTO);
	}
	
	this.Actualizar = function (estudianteDTO) {
		return $http.put('http://192.168.0.6:51792/api/Estudiantes/Actualizar', estudianteDTO);
	}
});