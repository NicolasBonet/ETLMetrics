'use strict';
app.factory('updateAbonos', function ($cacheFactory, $resource, REST_API) {
return $resource(REST_API.namespace+'/consultarTercero/updateAbonos', null, {
	'update': {method: 'PUT'}
});
});