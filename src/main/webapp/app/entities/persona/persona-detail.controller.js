(function() {
    'use strict';

    angular
        .module('compranetApp')
        .controller('PersonaDetailController', PersonaDetailController);

    PersonaDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'DataUtils', 'entity', 'Persona'];

    function PersonaDetailController($scope, $rootScope, $stateParams, previousState, DataUtils, entity, Persona) {
        var vm = this;

        vm.persona = entity;
        vm.previousState = previousState.name;
        vm.openFile = DataUtils.openFile;
        vm.byteSize = DataUtils.byteSize;

        var unsubscribe = $rootScope.$on('compranetApp:personaUpdate', function(event, result) {
            vm.persona = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
