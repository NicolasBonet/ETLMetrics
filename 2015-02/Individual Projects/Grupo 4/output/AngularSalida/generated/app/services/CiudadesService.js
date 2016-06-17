app.service('Ciudades', function ($http) {
	
	this.ObtenerTodos = function () {
		return $http.get('http://192.168.0.6:51792/api/Ciudades/ObtenerTodos');
	}
});