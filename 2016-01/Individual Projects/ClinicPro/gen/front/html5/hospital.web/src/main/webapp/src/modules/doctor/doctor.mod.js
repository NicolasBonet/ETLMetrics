(function(ng){
    var mod = ng.module("doctorModule", ["ui.bootstrap"]);
   	mod.constant("doctorContext", "http://localhost:8080/hospital.api/api/doctors");
})(window.angular);

