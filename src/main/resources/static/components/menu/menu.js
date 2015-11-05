(function() {
    var app = angular.module('menu',[]);
    var resourcePath = 'components/menu/';
    var logoutUrl = "http://localhost:8080/auth/login";

    app.directive('navBar', function(){
        return {
            restrict: 'E',
            templateUrl: resourcePath + 'menu.html',
            controller: function(){
                this.logout = function(){
                    $http.get(logoutUrl);
                }
            },
            controllerAs: 'menuController'
        };
    });
})();