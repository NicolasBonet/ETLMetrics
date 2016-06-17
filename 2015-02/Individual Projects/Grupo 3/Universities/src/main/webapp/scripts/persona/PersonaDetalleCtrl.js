'use strict';

/**
 * @ngdoc function
 * @name sistemagestionuniversitario.controller:PersonaDetalleCtrl
 * @description
 * # PersonaDetalleCtrl
 * Controller of the PersonaDetalle
 */
angular.module('sistemagestionuniversitario')
  .controller('PersonaDetalleCtrl', function ($scope, $rootScope, $http,  $dialogs, $location, $routeParams) {
	  
      	$scope.datos = [];
      	$scope.data = {};	    
	    
	    
	    if ($routeParams.id){	    	    
		    console.log("Consultar los(las) Persona(s)");
		    $http.get(raiz+"rest/Persona/Persona/"+$routeParams.id)
		    
		    .success(function(res){
		    	$rootScope.$broadcast('dialogs.wait.complete');
		    	$scope.data=res; 
		    
		    }).error(function(res){	  	  
		        console.log("Doesn't work");
		        $rootScope.$broadcast('dialogs.wait.complete');
		    });
	    }
	
		$scope.save=function(dataGuardar){
            console.log("save");
            console.log("data:"+angular.toJson( dataGuardar));
            if ($routeParams.id){
             $http.put(raiz+"rest/Persona/Persona", angular.toJson( dataGuardar))
            .success(function(res){
                toastr.success('JEE & Angular', 'Registro exitoso.');

                console.log(res);
            }).error(function(res){
                console.log("Doesn't work");
            });
            }else{
             $http.post(raiz+"rest/Persona/Persona", angular.toJson( dataGuardar))
            .success(function(res){
                toastr.success('JEE & Angular', 'Registro exitoso.');                
            }).error(function(res){
                console.log("Doesn't work");
            });
            }	
           
        };
	    	    
	
		$scope.eliminar=function(dataEliminar){
             $http.delete(raiz+"rest/Persona/Persona", angular.toJson( dataEliminar))
            .success(function(res){
                $dialogs.notify('Información!','Registro  Exitoso');
                console.log(res);
            }).error(function(res){
                console.log("Doesn't work");
            });
            	
           
        };
	    	    
    
    
  });
  
  
  
  
