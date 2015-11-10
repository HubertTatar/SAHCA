(function() {
    var app = angular.module('menu',[]);
    var resourcePath = 'components/menu/';

    app.directive('navBar', function(){
        return {
            restrict: 'E',
            templateUrl: resourcePath + 'menu.html'
        };
    });
})();