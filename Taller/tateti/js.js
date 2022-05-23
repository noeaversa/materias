let X = true; // si es true va X, sino va O
function marcar_X_O(elemento){
    if(elemento.innerText == "" || elemento.innerText == null){
        if(X == true){
            elemento.style.color = "green"; 
          elemento.append('X');
            X = false;    
        }else{
            elemento.style.color = "red";
            elemento.append('O');
            X = true;
        }
    }
    console.log(elemento);
    gano();
}

function imprimirGano(elemento){
    alert("gano " + elemento);
    window.location.reload();
}

function gano(){
    let p11 = document.getElementById("p11").innerText;
    let p21 = document.getElementById("p21").innerText;
    let p31 = document.getElementById("p31").innerText;
    let p12 = document.getElementById("p12").innerText;
    let p13 = document.getElementById("p13").innerText;
    let p23 = document.getElementById("p23").innerText;
    let p22 = document.getElementById("p22").innerText;
    let p33 = document.getElementById("p33").innerText;
    let p32 = document.getElementById("p32").innerText;

    if(p11 == p21 && p21 == p31 && p11 != "") imprimirGano(p11);
    else if(p12 == p22 && p22 == p32 && p22 != "") imprimirGano(p12);
    else if(p13 == p33 && p33 == p23 && p13 != "") imprimirGano(p33);
    else if(p11 == p12 && p13 == p12 && p12 != "") imprimirGano(p11);
    else if(p22 == p21 && p22 == p23 && p22 != "") imprimirGano(p22);
    else if(p33 == p31 && p33 == p32 && p33 != "") imprimirGano(p33);
    else if(p11 == p33 && p33 == p22 && p33 != "") imprimirGano(p22);
    else if(p13 == p22 && p22 == p31 && p22 != "") imprimirGano(p22);
    
}