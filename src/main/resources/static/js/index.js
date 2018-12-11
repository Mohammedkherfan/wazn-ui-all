angular.module('sortApp', [])

.controller('mainController', function($scope) {
  $scope.sortType     = 'mobile'; // set the default sort type
  $scope.sortReverse  = false;  // set the default sort order
  $scope.searchFish   = '';     // set the default search/filter term
  
  // create the list of sushi rolls 
  $scope.sushi = [
    { name: 'Cali Roll', fish: 'Crab', tastiness: 2 },
    { name: 'Philly', fish: 'Tuna', tastiness: 4 },
    { name: 'Tiger', fish: 'Eel', tastiness: 7 },
    { name: 'Rainbow', fish: 'Variety', tastiness: 6 }
  ];
  
});


document.getElementById('search').onkeydown = function(event) {
    if (event.keyCode == 13) {
        window.location = "/user/"+document.getElementById("search").value;
    }
}


function save() {
    alert();
}

