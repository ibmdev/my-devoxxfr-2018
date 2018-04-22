(function () {
    'use strict';

    angular
        .module('springboot2WebapplicationAngularjsJhipsterApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
