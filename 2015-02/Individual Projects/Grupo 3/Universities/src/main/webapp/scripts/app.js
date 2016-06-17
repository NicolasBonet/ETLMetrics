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
  	
      .when('/personalista', {
        templateUrl: 'views/persona/PersonaLista.html',
        controller: 'PersonaListaCtrl'
      })
      
      
      .when('/personadetalle', {
        templateUrl: 'views/persona/PersonaDetalle.html',
        controller: 'PersonaDetalleCtrl'
      })
      
      .when('/personadetalle/:id', {
        templateUrl: 'views/persona/PersonaDetalle.html',
        controller: 'PersonaDetalleCtrl'
      })
      
      .when('/cursolista', {
        templateUrl: 'views/curso/CursoLista.html',
        controller: 'CursoListaCtrl'
      })
      
      
      .when('/cursodetalle', {
        templateUrl: 'views/curso/CursoDetalle.html',
        controller: 'CursoDetalleCtrl'
      })
      
      .when('/cursodetalle/:id', {
        templateUrl: 'views/curso/CursoDetalle.html',
        controller: 'CursoDetalleCtrl'
      })
      
      .when('/profesorlista', {
        templateUrl: 'views/profesor/ProfesorLista.html',
        controller: 'ProfesorListaCtrl'
      })
      
      
      .when('/profesordetalle', {
        templateUrl: 'views/profesor/ProfesorDetalle.html',
        controller: 'ProfesorDetalleCtrl'
      })
      
      .when('/profesordetalle/:id', {
        templateUrl: 'views/profesor/ProfesorDetalle.html',
        controller: 'ProfesorDetalleCtrl'
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