'use strict';

/**
 * @ngdoc function
 * @name sistemagestionuniversitario.controller:UniversidadDetalleCtrl
 * @description
 * # UniversidadDetalleCtrl
 * Controller of the UniversidadDetalle
 */
angular.module('sistemagestionuniversitario')
  .controller('UniversidadDetalleCtrl', function ($scope, $rootScope, $http,  $dialogs, $location, $routeParams) {
	  
      	$scope.datos = [];
      	$scope.data = {};	    
	    
	    
	    if ($routeParams.id){	    	    
		    console.log("Consultar los(las) Universidad(s)");
		    $http.get("http://localhost:8080/rad/rest/Universidad/Universidad/"+$routeParams.id)
		    
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
             $http.put("http://localhost:8080/rad/rest/Universidad/Universidad", angular.toJson( dataGuardar))
            .success(function(res){
                toastr.success('JEE & Angular', 'Registro exitoso.');

                console.log(res);
            }).error(function(res){
                console.log("Doesn't work");
            });
            }else{
             $http.post("http://localhost:8080/rad/rest/Universidad/Universidad", angular.toJson( dataGuardar))
            .success(function(res){
                toastr.success('JEE & Angular', 'Registro exitoso.');                
            }).error(function(res){
                console.log("Doesn't work");
            });
            }	
           
        };
	    	    
	
		$scope.eliminar=function(dataEliminar){
             $http.delete("http://localhost:8080/rad/rest/Universidad/Universidad", angular.toJson( dataEliminar))
            .success(function(res){
                $dialogs.notify('Información!','Registro  Exitoso');
                console.log(res);
            }).error(function(res){
                console.log("Doesn't work");
            });
            	
           
        };
	    	    
    
    
  });
  
  
  
  
