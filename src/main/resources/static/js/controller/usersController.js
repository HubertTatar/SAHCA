angular.module('credentialsApp')
    .constant('userUrl','http://localhost:8080/user')
    .controller('usersController', function($scope, $http, userUrl){
        var obj = this;
        obj.users = [];
        $http.get(userUrl).success(function(data){
            obj.users = data;
        });
    });