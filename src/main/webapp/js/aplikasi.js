function KolektorController($scope, $http) {

    $scope.daftarEmail = [
        'Yahoo',
        'GMail',
        'Hotmail'
    ];

    $scope.reloadKolektor = function() {
        $http.get('../../aplikasi-springmvc/kolektor/json').success(function(data) {
            $scope.daftarKolektor = data;
        });
    };
}