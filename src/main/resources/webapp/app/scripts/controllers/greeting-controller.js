'use strict';

angular.module('webappApp')
  .controller('GreetingController', function ($scope, $http) {
		console.log("retrieve greeting");
	    $http.get('http://rest-service.guides.spring.io/greeting').
	        success(function(data) {
	            $scope.greeting = data;
	        });
		console.log("retrieved greeting");
  });
