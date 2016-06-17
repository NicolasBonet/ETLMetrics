'use strict';

/**
 * @ngdoc function
 * @name sistemagestionuniversitario.controller:PersonaListaCtrl
 * @description
 * # PersonaListaCtrl
 * Controller of the PersonaLista
 */
angular.module('sistemagestionuniversitario')
  .controller('PersonaListaCtrl', function ($scope, $rootScope, $http,  $dialogs, $location, $routeParams) {
	  
      	$scope.datos = [];
      	$scope.data = {};	    
	    
	    console.log("Consultar los(las) Persona(s)");
	    $http.get(raiz+"rest/Persona/Personas")
	    
	    .success(function(res){
	    	$rootScope.$broadcast('dialogs.wait.complete');
$scope.datos=res
	    	
	    	
	    	 
	    	console.log(res);
	    
	    }).error(function(res){	  	  
	        console.log("Doesn't work");
	        $rootScope.$broadcast('dialogs.wait.complete');
	    });
	    
    
    
  });
  
  
  
  
