var games=["cricket", "badminton", "chess", "volleyball", "football","carrom"];


function mapgamesToList(){
    var listStr="";
    for(var i=0; i<games.length;i++)
    listStr +=
      '<li class="list-group-item d-flex justify-content-between align-items-center">'
       + '<span class="lead">' + games[i] +
      "</span>" +
      '<span><button class="btn btn-danger material-icons"  onclick="deletegames(' + i +
      ')">clear</button></span>' +
      "</li>";
    // {
    //     listStr += '<li class="list-group-item">' +games[i]+ '</li>';
    // }
    document.getElementById("gamesList").innerHTML=listStr;
}
function deletegames(index){
    games.splice(index,1);
    mapgamesToList();

}

function addgames(){
    var newgames = document.getElementById('newgamesText').value
    games.unshift(newgames)

    document.getElementById('newgamesText').value = ''
    
    textChanged()
    mapgamesToList()

  }

function textChanged() {
    var newgames = document.getElementById('newgamesText').value
    if (newgames.length == 0) {
        document.getElementById('addButton').disabled = true
    }
    else {
        document.getElementById('addButton').disabled = false
    }
}
  