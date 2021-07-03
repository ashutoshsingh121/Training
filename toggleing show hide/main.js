
var paraFlag= true;

function toggle(){
    paraFlag=!paraFlag;

    if(!paraFlag)
    {
        
    document.getElementById("paraId").style.display = "none";
    // document.getElementById("fg").innerText=show;
    }
    else{
        document.getElementById("paraId").style.display = "block";

        // document.getElementById("fg").innerText=hide;

    }

}