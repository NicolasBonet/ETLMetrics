'use strict';
app.factory('deleteAbonos', function ($cacheFactory, $resource, REST_API) {
return $resource(REST_API.namespace+'/consultarTercero/deleteAbonos', null, {
	'delete': {method: 'PUT'}
});
});