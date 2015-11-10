angular.module('credentialsApp')
    //.constant('logoutUrl','http://localhost:8080/auth/login')
    .controller('menuController', function($scope, $http, config){

        $scope.logout = function() {
            alert('asd');
            $http.get(config.backend + 'logout');
        }
    });