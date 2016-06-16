'use strict';
app.factory('deletePersonas', function ($cacheFactory, $resource, REST_API) {
return $resource(REST_API.namespace+'/consultarTercero/deletePersonas', null, {
	'delete': {method: 'PUT'}
});
});