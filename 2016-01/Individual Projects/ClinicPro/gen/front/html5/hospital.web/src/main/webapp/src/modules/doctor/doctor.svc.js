(function (ng) {

    var mod = ng.module("doctorModule");

    mod.service("doctorService", ["$http", "doctorContext", function ($http, context) {
            
            this.fetchRecords = function () {
                return $http.get(context);
            };

            this.fetchRecord = function (pk) {
                return $http.get(context + "/" + pk);
            };

            this.saveRecord = function (currentRecord) {
                if (currentRecord.id) {
                    return $http.put(context + "/" + currentRecord.id, currentRecord);
                } else {
                    return $http.post(context, currentRecord);
                }
            };

            this.deleteRecord = function (id) {
                return $http.delete(context + "/" + id);
            };
        }]);
})(window.angular);