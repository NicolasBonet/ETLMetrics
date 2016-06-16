'use strict';
app.factory('createPersonas', function ($cacheFactory, $resource, REST_API) {
return $resource(REST_API.namespace+'/consultarTercero/createPersonas', null, {
	'create': {method: 'PUT'}
});
});