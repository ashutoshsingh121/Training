function add() {
    document.getElementById("numSpan").innerText++;
    setColor()
  }
  

  function remove() {
    document.getElementById("numSpan").innerText--;
    setColor()
  }

  function setColor(){
    var num = document.getElementById("numSpan").innerText
    var color = (num>0)? 'text-success' : (num<0) ? 'text-danger' : 'text-primary'
  
    document.getElementById("numSpan").className = 'lead mx-2 ' + color
  
  
  }