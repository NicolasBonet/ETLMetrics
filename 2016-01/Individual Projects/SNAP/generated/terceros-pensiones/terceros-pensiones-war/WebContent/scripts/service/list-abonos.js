'use strict';
app.factory('allAbonos', function ($cacheFactory, $resource, REST_API) {
return $resource(REST_API.namespace+'/consultarTercero/allAbonos', null, {
'query': {method: 'GET', isArray: true }
});
});