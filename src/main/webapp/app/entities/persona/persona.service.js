(function() {
    'use strict';
    angular
        .module('compranetApp')
        .factory('Persona', Persona);

    Persona.$inject = ['$resource', 'DateUtils'];

    function Persona ($resource, DateUtils) {
        var resourceUrl = 'api/personas/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
						data.fechaCreacion = DateUtils.convertLocalDateFromServer(data.fechaCreacion);
                    }
                    return data;
                }
            },
            'update': {
                method: 'PUT',
                transformRequest: function (data) {
                    var copy = angular.copy(data);
				    copy.fechaCreacion = DateUtils.convertLocalDateToServer(copy.fechaCreacion);
        		return angular.toJson(copy);
                }
            },
            'save': {
                method: 'POST',
                transformRequest: function (data) {
                    var copy = angular.copy(data);
				    copy.fechaCreacion = DateUtils.convertLocalDateToServer(copy.fechaCreacion);
                    return angular.toJson(copy);
                }
            }
        });
    }
})();