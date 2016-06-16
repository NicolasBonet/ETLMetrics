app.controller('personasController', function($scope,createPersonas, updatePersonas, deletePersonas, allPersonas) {

$scope.personas= {};
$scope.personas.abonos= [];
$scope.abonosNew= {};

allPersonas.query().$promise.then(function(data) {
$scope.listPersonas = data;
});

$scope.loadPersonas = function(personas) {
$scope.personas= personas;
};
$scope.deletePersonas = function(personas) {
var personas = personas;
personas= new deletePersonas(personas);
personas.$delete(function() {
console.log("Se elimino el registro");
alert("Se elimino el registro");
$scope.personas= {};
$scope.personas.abonos= [];
$scope.listPersonas.splice($scope.listPersonas.indexOf(personas),1);
}, function() {
console.log("No se elimino el registro");
alert("No se elimino el registro");
});
};

$scope.newPersonas = function() {
$scope.personas= {};
$scope.personas.abonos= [];
};

$scope.savePersonas = function() {
var personas = $scope.personas;
if($scope.personas.id == undefined){
personas= new createPersonas(personas);
personas.$create(function() {
console.log("Se guardo el nuevo");
alert("Se guardo el nuevo");
$scope.listPersonas.push($scope.personas);
}, function() {
console.log("No se guardo");
alert("No se guardo");
});
} else {
personas= new updatePersonas(personas);
personas.$update(function() {
console.log("Se actualizo");
alert("Se actualizo");
}, function() {
console.log("No se actualizo");
alert("No se actualizo");
});
}
};

$scope.saveAbonos = function(){
$scope.personas.abonos.push($scope.abonosNew);
$scope.abonosNew = {};
};
$scope.deleteAbonos = function(){
for(var i in $scope.personas.abonos){
$scope.personas.abonos.splice($scope.personas.abonos.indexOf($scope.personas.abonos[i]),1);
}
};

});