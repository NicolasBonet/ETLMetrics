'use strict';

/**
 * @ngdoc function
 * @name sistemagestionuniversitario.controller:CursoListaCtrl
 * @description
 * # CursoListaCtrl
 * Controller of the CursoLista
 */
angular.module('sistemagestionuniversitario')
  .controller('CursoListaCtrl', function ($scope, $rootScope, $http,  $dialogs, $location, $routeParams) {
	  
      	$scope.datos = [];
      	$scope.data = {};	    
	    
	    console.log("Consultar los(las) Curso(s)");
	    $http.get(raiz+"rest/Curso/Cursos")
	    
	    .success(function(res){
	    	$rootScope.$broadcast('dialogs.wait.complete');
$scope.datos=res
	    	
	    	
	    	 
	    	console.log(res);
	    
	    }).error(function(res){	  	  
	        console.log("Doesn't work");
	        $rootScope.$broadcast('dialogs.wait.complete');
	    });
	    
    
    
  });
  
  
  
  
