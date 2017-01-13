(function (ng) {

    var mod = ng.module("mainApp", [
        "ui.router"
        ,"pacienteModule"
        ,"servicioModule"
        ,"doctorModule"
  
    ]);

    mod.config(['$logProvider', function ($logProvider) {
            $logProvider.debugEnabled(true);
        }]);

    mod.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
            $urlRouterProvider.otherwise("/person");
            $stateProvider

                    .state('person', {
                        url: '/person',
                        views: {
							"paciente": {controller: "pacienteCtrl",
                            controllerAs: "ctrl",
                            templateUrl: "src/modules/paciente/paciente.tpl.html"}
															     
							,"servicio": {controller: "servicioCtrl",
                            controllerAs: "ctrl",
                            templateUrl: "src/modules/servicio/servicio.tpl.html"}
							,"doctor": {controller: "doctorCtrl",
                            controllerAs: "ctrl",
                            templateUrl: "src/modules/doctor/doctor.tpl.html"}
                         
                        }
                    });

        }]);
})(window.angular);