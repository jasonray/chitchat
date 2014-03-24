'use strict';

angular.module('webappApp')
  .controller('SingleMessageController', function ($scope) {
		$scope.sampleMessage = {from:'John Smith', to:'Abby Mallard', message:'this is a sample message'};
  });
