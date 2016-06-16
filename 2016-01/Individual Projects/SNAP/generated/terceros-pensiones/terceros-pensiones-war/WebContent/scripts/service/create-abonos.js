'use strict';
app.factory('createAbonos', function ($cacheFactory, $resource, REST_API) {
return $resource(REST_API.namespace+'/consultarTercero/createAbonos', null, {
	'create': {method: 'PUT'}
});
});