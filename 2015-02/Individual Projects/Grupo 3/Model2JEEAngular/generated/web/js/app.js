'use strict';

/**
 * @ngdoc overview
 * @name sistemagestionuniversitario
 * @description
 * # sistemagestionuniversitario
 *
 * Main module of the application.
 */
angular
  .module('sistemagestionuniversitario', ['ngRoute', 'ui.bootstrap','dialogs', 'pascalprecht.translate', 'ngStorage']) 
 .config(function ($routeProvider, $translateProvider, $httpProvider) {
    $routeProvider
  	
      .when('/UsuarioLista', {
        templateUrl: 'views/UsuarioLista/UsuarioLista.html',
        controller: 'UsuarioListaCtrl'
      })
      
      
      .when('/UsuarioDetalle', {
        templateUrl: 'views/UsuarioDetalle/UsuarioDetalle.html',
        controller: 'UsuarioDetalleCtrl'
      })
      
      .when('/UsuarioDetalle/:id', {
        templateUrl: 'views/UsuarioDetalle/UsuarioDetalle.html',
        controller: 'UsuarioDetalleCtrl'
      })
      
      .when('/PersonaLista', {
        templateUrl: 'views/PersonaLista/PersonaLista.html',
        controller: 'PersonaListaCtrl'
      })
      
      
      .when('/PersonaDetalle', {
        templateUrl: 'views/PersonaDetalle/PersonaDetalle.html',
        controller: 'PersonaDetalleCtrl'
      })
      
      .when('/PersonaDetalle/:id', {
        templateUrl: 'views/PersonaDetalle/PersonaDetalle.html',
        controller: 'PersonaDetalleCtrl'
      })
      
      .when('/Index', {
        templateUrl: 'views/Index/Index.html',
        controller: 'SistemaGestionUniversitarioCtrl'
      })
      
      
      
      
      .otherwise({
        redirectTo: '/'
      });
    
		$translateProvider.useStaticFilesLoader({
        prefix: 'res/locale-',
        suffix: '.json'
      });

      $translateProvider.preferredLanguage("es_CO");
      
      $httpProvider.interceptors.push(['$q', '$location', '$localStorage', function($q, $location, $localStorage) {
          return {
              'request': function (config) {
                  config.headers = config.headers || {};
                  
                  //if ($localStorage.token) {
            	  if (localStorage["token"] && localStorage["username"]) {
                      //config.headers.Authorization = $localStorage.token;
                      config.headers.Authorization = localStorage["username"] +"@-"+localStorage["token"];
                  }
                  return config;
              },
              'responseError': function(response) {
                  if(response.status === 401 || response.status === 403 || response.status === 409) {
                      //$location.path('/');
                      window.location = "login.html#/";
                  }
                  return $q.reject(response);
              }
          };
      }]);

 
});