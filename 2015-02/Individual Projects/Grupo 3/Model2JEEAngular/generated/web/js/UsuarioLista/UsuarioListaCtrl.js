'use strict';

/**
 * @ngdoc function
 * @name sistemagestionuniversitario.controller:UsuarioListaCtrl
 * @description
 * # UsuarioListaCtrl
 * Controller of the UsuarioLista
 */
angular.module('sistemagestionuniversitario')
  .controller('UsuarioListaCtrl', function ($scope, $rootScope, $http,  $dialogs, $location, $routeParams) {
	  
      	$scope.datos = [];
      	$scope.data = {};	    
	    
	    console.log("Consultar los(las) Usuario(s)");
	    $http.get("http://localhost:8080/rad/rest/Usuario/Usuarios")
	    
	    .success(function(res){
	    	$rootScope.$broadcast('dialogs.wait.complete');
	    	$scope.datos=res; 
	    	console.log(res);
	    
	    }).error(function(res){	  	  
	        console.log("Doesn't work");
	        $rootScope.$broadcast('dialogs.wait.complete');
	    });
	    
    
    
  });
  
  
  
  
