app.controller('abonosController', function($scope,createAbonos, updateAbonos, deleteAbonos, allAbonos) {

$scope.abonos= {};

allAbonos.query().$promise.then(function(data) {
$scope.listAbonos = data;
});

$scope.loadAbonos = function(abonos) {
$scope.abonos= abonos;
};
$scope.deleteAbonos = function(abonos) {
var abonos = abonos;
abonos= new deleteAbonos(abonos);
abonos.$delete(function() {
console.log("Se elimino el registro");
alert("Se elimino el registro");
$scope.abonos= {};
$scope.listAbonos.splice($scope.listAbonos.indexOf(abonos),1);
}, function() {
console.log("No se elimino el registro");
alert("No se elimino el registro");
});
};

$scope.newAbonos = function() {
$scope.abonos= {};
};

$scope.saveAbonos = function() {
var abonos = $scope.abonos;
if($scope.abonos.id == undefined){
abonos= new createAbonos(abonos);
abonos.$create(function() {
console.log("Se guardo el nuevo");
alert("Se guardo el nuevo");
$scope.listAbonos.push($scope.abonos);
}, function() {
console.log("No se guardo");
alert("No se guardo");
});
} else {
abonos= new updateAbonos(abonos);
abonos.$update(function() {
console.log("Se actualizo");
alert("Se actualizo");
}, function() {
console.log("No se actualizo");
alert("No se actualizo");
});
}
};


});