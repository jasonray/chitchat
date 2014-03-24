'use strict';

angular.module('webappApp')
  .controller('SingleMessageController', function ($scope) {
  		console.log("building controller SingleMessageController");
		$scope.sampleMessage = {from:'John Smith', to:'Abby Mallard', message:'this is a sample message'};
  });
