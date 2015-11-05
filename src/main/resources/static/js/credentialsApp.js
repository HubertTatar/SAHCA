angular.module('credentialsApp', ['ngRoute', 'menu'])
    .config(function($routeProvider) {

        $routeProvider.when("/users", {
            templateUrl: "partials/users.html"
        });
    })
;