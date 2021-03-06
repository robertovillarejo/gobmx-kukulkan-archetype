(function () {
    'use strict';

    angular
        .module('compranetApp')
        .controller('NavbarController', NavbarController);

    NavbarController.$inject = ['$scope', '$state', 'Principal', 'ProfileService', 'Auth'];

    function NavbarController($scope, $state, Principal, ProfileService, Auth) {
        var vm = this;

        vm.isAuthenticated = Principal.isAuthenticated;
        vm.$state = $state;
        vm.account = null;
        vm.isAuthenticated = null;
        vm.login = login;
        vm.logout = logout;

        ProfileService.getProfileInfo().then(function (response) {
            vm.inProduction = response.inProduction;
            vm.swaggerEnabled = response.swaggerEnabled;
        });

        $scope.$on('authenticationSuccess', function () {
            getAccount();
        });

        getAccount();

        function getAccount() {
            Principal.identity().then(function (account) {
                vm.account = account;
                vm.isAuthenticated = Principal.isAuthenticated;
            });
        }

        function logout() {
            Auth.logout();
            $state.go('home');
        }

        function login() {
            $state.go('login');
        }
    }
})();
