'use strict';

angular.module('webappApp', [
  'ngCookies',
  'ngResource',
  'ngSanitize',
  'ngRoute'
])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .when('/sample', {
        templateUrl: 'views/sample-message.html',
        controller: 'SingleMessageController'
      })
      .when('/list-messages', {
        templateUrl: 'views/list-message.html',
        controller: 'ListMessagesController'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
