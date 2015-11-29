angular.module('credentialsApp')
    .controller('usersController', function($scope, $http, config){

        $scope.userUrl = config.backend + 'users';

        var self = this;
        self.users = [];

        $scope.criterias = [{
            id: 1,
            label: 'ID',
            type: '[object Number]',
            subItem: { name: 'id' }
        }, {
            id: 2,
            label: 'Name',
            type: '[object String]',
            subItem: { name: 'name' }
        }, {
            id: 3,
            label: 'Mail',
            type: '[object String]',
            subItem: { name: 'email' }
        }];

        $scope.selected = $scope.criterias[1];

        //TODO cannot read property 'protocol' of undefined
        $scope.getUsers = function(criteria){
            if (verifyCriteria(criteria) && verifyCriteriaType(criteria)) {
                request(createRequestUrl(criteria))
            } else {
                request($scope.userUrl)
            }
        }

        $scope.showAddUserDialog = function() {
            $scope.showModal = true;
        }

        ///cars?color=blue;type=sedan
        ///cars?color=black,blue,red;doors=3,5;type=sedan
        function createRequestUrl(criteria) {
            return request($scope.userUrl + '/search?criteria=' + $scope.selected.subItem.name + '&value=' + criteria);
        }

        function verifyCriteriaType (criteria) {
            var getType = function (criteria) {
                return Object.prototype.toString.call(criteria);
            };
            return getType(criteria) === $scope.selected.type;
        }

        function request(url) {
            $http.get(url).success(function(data, status) {
                self.users = data;
                $scope.messages = null;
                $scope.status = null;
            }).error(function(data, status) {
                $scope.messages = data || "Request failed";
                $scope.status = status;
            })
        }

        function verifyCriteria (criteria){
            return !(isEmpty(criteria) || isBlank(criteria));

        }

        function isEmpty(str) {
            return (!str || 0 === str.length);
        }

        function isBlank(str) {
            return (!str || /^\s*$/.test(str));
        }
    });