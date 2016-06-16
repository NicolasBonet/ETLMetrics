'use strict';
app.factory('allPersonas', function ($cacheFactory, $resource, REST_API) {
return $resource(REST_API.namespace+'/consultarTercero/allPersonas', null, {
'query': {method: 'GET', isArray: true }
});
});