(function (ng) {

    var mod = ng.module("doctorModule");

    mod.controller("doctorCtrl", ["$scope", "$rootScope","doctorService", function ($scope,$rootScope, svc) {
          
            $scope.currentRecord = {};
            $scope.records = [];

            $scope.today = function () {
                $scope.value = new Date();
            };

            $scope.clear = function () {
                $scope.value = null;
            };

            $scope.open = function ($event) {
                $event.preventDefault();
                $event.stopPropagation();

                $scope.opened = true;
            };


            var self = this;
            
            //SOLO PERSON
            $scope.record = {}
            $rootScope.paciente={};
            //FIN
            
            function responseError(response) {
                self.showError(response.data);
            }
            
            
            //Variables para el controlador
            this.readOnly = false;
            
            //for CRUD
            this.editMode = false;
            
            //SOLO PERSON
            this.editModeSearch = true;
            this.editModeList=false;
            //FIN

            this.changeTab = function (tab) {
                $scope.tab = tab;
            };
			
			//Consultar una persona para asignar servico
            this.getRecord = function (record) {
	
				return svc.fetchRecord(record.cedula).then(function (response){							
					$scope.record = response.data;
                    $scope.currentRecord = response.data;
                    $rootScope.paciente= response.data;
                }, responseError);
            };
            //FIN

            //Metodos para el CRUD
            this.createRecord = function () {
             $scope.$broadcast("pre-create", $scope.currentRecord);
             this.editMode = true;
             this.editModeSearch=true; 
             this.editModeConsult=true; //SOLO EN SERVICES
             self.editModeList=true;
            
             $scope.currentRecord = {};
             $scope.$broadcast("post-create", $scope.currentRecord);
             };
             
             this.editRecord = function (record) {
             console.log("LLego? " + record.id);
             $scope.$broadcast("pre-edit", $scope.currentRecord);
             return svc.saveRecord(record).then(function (response) {
             $scope.currentRecord = response.data;
             self.editMode = true;
             //SOLO EN SERVICES self.editModeList=true;
             
             $scope.$broadcast("post-edit", $scope.currentRecord);
             return response;
             }, responseError);
             };
             
             this.fetchRecords = function () {
             return svc.fetchRecords().then(function (response) {
             $scope.records = response.data;
             $scope.currentRecord = {};
             
             this.editModeSearch=true;
             this.editModeConsult=true; //SOLO EN SERVICES
             self.editMode = false;
             self.editModeList=false;
           
             return response;
             }, responseError);
             };
             
             this.saveRecord = function () {
             return svc.saveRecord($scope.currentRecord).then(function () {
             self.fetchRecords();
             }, responseError);
             };
             
             this.deleteRecord = function (record) {
             return svc.deleteRecord(record.id).then(function () {
             self.fetchRecords();
             }, responseError);
             };
             
             this.fetchRecords();
             
             //SOLO PERSON
             this.searchRecord=function (){
                this.editModeSearch=false;
                self.editModeList=true;
             };
             //FIN
             
             //SOLO SERVICES
             this.getRecords = function () {
                return svc.fetchRecords().then(function (response) {
                    $scope.records = response.data;
                    console.log($scope.records);
                    return response;
                }, responseError);
            };

            this.getRecords();

            this.getCost = function (record) {
                return svc.fetchRecord(record.servicio).then(function (response) {
                    $scope.servicio = response.data;
                    console.log("Root scope");
                    console.log($rootScope.paciente);
                    return response;
                }, responseError);
            };

            this.print=function(elementId) {
                var a = document.getElementById('printing-css').value;
                var b = document.getElementById(elementId).innerHTML;
                window.frames["print_frame"].document.title = document.title;
                window.frames["print_frame"].document.body.innerHTML = '<style>' + a + '</style>' + b;
                window.frames["print_frame"].window.focus();
                window.frames["print_frame"].window.print();
            }
            
            //
            this.consult=function ()
            {
                self.editModeConsult=false;
                self.editModeList=true;

                
            };
            //FIN
             
        }]);

})(window.angular);