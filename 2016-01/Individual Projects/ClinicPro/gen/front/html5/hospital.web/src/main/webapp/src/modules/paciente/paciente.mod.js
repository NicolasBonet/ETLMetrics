(function(ng){
    var mod = ng.module("pacienteModule", ["ui.bootstrap"]);
   	mod.constant("pacienteContext", "http://localhost:8080/hospital.api/api/pacientes");
})(window.angular);

