angular.module("loginApp",[])//'spring-security-csrf-token-interceptor'
    .constant("authUrl", "http://localhost:8080/auth/login")
    .controller("loginCtrl", function($scope) {
        $scope.greeting = {id: 'xxx', content: 'Hello World!'}
    });