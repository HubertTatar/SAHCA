angular.module('credentialsApp')
    .controller('rolesController', function($scope, $http, $resource, rolesUrl){

        $scope.userUrl = config.backend + 'roles';

    });