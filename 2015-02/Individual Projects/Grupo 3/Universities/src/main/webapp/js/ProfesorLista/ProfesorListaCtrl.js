'use strict';

/**
 * @ngdoc function
 * @name sistemagestionuniversitario.controller:ProfesorListaCtrl
 * @description
 * # ProfesorListaCtrl
 * Controller of the ProfesorLista
 */
angular.module('sistemagestionuniversitario')
  .controller('ProfesorListaCtrl', function ($scope, $rootScope, $http,  $dialogs, $location, $routeParams) {
	  
      	$scope.datos = [];
      	$scope.data = {};	    
	    
	    console.log("Consultar los(las) Profesor(s)");
	    $http.get("http://localhost:8080/rad/rest/Profesor/Profesors")
	    
	    .success(function(res){
	    	$rootScope.$broadcast('dialogs.wait.complete');
	    	$scope.datos=res; 
	    	console.log(res);
	    
	    }).error(function(res){	  	  
	        console.log("Doesn't work");
	        $rootScope.$broadcast('dialogs.wait.complete');
	    });
	    
    
    
  });
  
  
  
  
