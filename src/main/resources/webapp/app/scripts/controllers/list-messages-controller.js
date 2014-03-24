'use strict';

angular.module('webappApp')
  .controller('ListMessagesController', function ($scope) {
  		console.log("building controller SingleMessageController");
		$scope.messages = 
			[
				{from:'John Smith', to:'Abby Mallard', message:'this is a sample message 1'},
				{from:'John Smith', to:'Abby Mallard', message:'this is a sample message 2'},
				{from:'John Smith', to:'Abby Mallard', message:'this is a sample message 3'},
				{from:'John Smith', to:'Abby Mallard', message:'this is a sample message 4'}
			]
  });
