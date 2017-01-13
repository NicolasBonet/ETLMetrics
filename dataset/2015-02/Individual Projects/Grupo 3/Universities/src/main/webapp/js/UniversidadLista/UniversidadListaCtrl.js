'use strict';

/**
 * @ngdoc function
 * @name sistemagestionuniversitario.controller:UniversidadListaCtrl
 * @description
 * # UniversidadListaCtrl
 * Controller of the UniversidadLista
 */
angular.module('sistemagestionuniversitario')
  .controller('UniversidadListaCtrl', function ($scope, $rootScope, $http,  $dialogs, $location, $routeParams) {
	  
      	$scope.datos = [];
      	$scope.data = {};	    
	    
	    console.log("Consultar los(las) Universidad(s)");
	    $http.get("http://localhost:8080/rad/rest/Universidad/Universidads")
	    
	    .success(function(res){
	    	$rootScope.$broadcast('dialogs.wait.complete');
	    	$scope.datos=res; 
	    	console.log(res);
	    
	    }).error(function(res){	  	  
	        console.log("Doesn't work");
	        $rootScope.$broadcast('dialogs.wait.complete');
	    });
	    
    
    
  });
  
  
  
  
