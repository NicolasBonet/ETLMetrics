'use strict';
app.factory('updatePersonas', function ($cacheFactory, $resource, REST_API) {
return $resource(REST_API.namespace+'/consultarTercero/updatePersonas', null, {
	'update': {method: 'PUT'}
});
});