(function(ng){
    var mod = ng.module("servicioModule", ["ui.bootstrap"]);
   	mod.constant("servicioContext", "http://localhost:8080/hospital.api/api/servicios");
})(window.angular);

