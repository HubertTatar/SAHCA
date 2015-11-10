angular.module('credentialsApp', ['ngRoute', 'menu'])
    .constant('config',{
        'backend': 'http://localhost:8090/'
    })
    .config(function($routeProvider) {

        $routeProvider.when("/users", {
            templateUrl: "partials/users.html"
        });
    })
;