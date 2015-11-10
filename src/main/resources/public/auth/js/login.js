angular.module("loginApp",['common'])//'spring-security-csrf-token-interceptor'
    .constant("authUrl", "http://localhost:8080/auth/login")
    .controller("loginCtrl", ['$scope', '$http', function($scope, $http){
        $scope.onLogin = function () {
            $scope.vm.submitted = true;
            if ($scope.form.$invalid) {
                return;
            }
            $scope.login($scope.vm.username, $scope.vm.password)
        }
    }]);