(function() {
    'use strict';

    angular
        .module('springboot2WebapplicationAngularjsJhipsterApp')
        .factory('Password', Password);

    Password.$inject = ['$resource'];

    function Password($resource) {
        var service = $resource('api/account/change_password', {}, {});

        return service;
    }
})();
