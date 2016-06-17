var app = angular.module('web-api-muliplataforma', ['ui.router']);

// It's very handy to add references to $state and $stateParams to the $rootScope
// so that you can access them from any scope within your applications.
// For example, <li ng-class="{ active: $state.includes('contacts.list') }">
// will set the <li> to active whenever 'contacts.list' or one of its
// decendents is active.
app.run(["$rootScope", "$state", "$stateParams", function ($rootScope, $state, $stateParams) {
    $rootScope.$state = $state;
    $rootScope.$stateParams = $stateParams;
}]);

var $stateProviderRef = null;

app.run(["$q", "$rootScope", "$state", "$http", "$urlRouter",
function ($q, $rootScope, $state, $http, $urlRouter) {
    var states = [
        {
            name: "index",
            url: "/",
            abstract: true,
            template: '<ui-view />'
        },
        {
            name: "p404",
            url: "/404",
            templateUrl : "app/views/404.html"
        },
        {
            name: "EstudiantesCrear",
            url: "/estudiantes/c",
            templateUrl : "app/views/Estudiante.html",
            controller: "EstudiantesCrearController"
        },
        {
            name: "EstudiantesEditar",
            url: "/estudiantes/e/:id",
            templateUrl : "app/views/Estudiante.html",
            controller: "EstudiantesActualizarController"
        }
    ];
    states.forEach(function(state){
        $stateProviderRef.state(state);
    });

    // Configures $urlRouter's listener *after* your custom listener
    $urlRouter.sync();
    $urlRouter.listen();
}]);


app.config(["$stateProvider", "$httpProvider", "$locationProvider", "$urlMatcherFactoryProvider", "$urlRouterProvider",
function ($stateProvider, $httpProvider, $locationProvider, $urlMatcherFactoryProvider, $urlRouterProvider) {
    $urlRouterProvider.deferIntercept();
    $urlRouterProvider.otherwise("/404");
    $urlMatcherFactoryProvider.caseInsensitive(true);
    $locationProvider.hashPrefix("!").html5Mode(true);
    $stateProviderRef = $stateProvider;
    //$httpProvider.interceptors.push("AuthHttpResponseInterceptor");
}]);


function invokeService(promise) {
    promise.catch(function (response) {
        console.log(response);
    });
}
