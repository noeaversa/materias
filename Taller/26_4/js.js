function cambiarDisplay(i, boolean){
    if(boolean == true) i.style.display = "flex";
    else i.style.display = "none";
}

function aparecerInputs(){
    let var1 = cambiarDisplay(document.getElementById("i_uno"), true);
    let var2 = cambiarDisplay(document.getElementById("i_dos"), true);
    let var3 = cambiarDisplay(document.getElementById("i_tres"), true);
    let b1 = cambiarDisplay(document.getElementById("botonIngresar"), true);
   
    /* document.getElementsByClassName("inputs").style.display = "flex";
    se penso en esta alternativa pero no funciona
    */
}

function agregarDatos(){
    let tabla = document.getElementById("Tabla");
    let fila = document.createElement("tr");
    let columna1 = document.createElement("th");
    let columna2 = document.createElement("th");
    let columna3 = document.createElement("th");

    let value1 = document.getElementById("i_uno");
    let value2 = document.getElementById("i_dos");
    let value3 = document.getElementById("i_tres");

    columna1.append(value1.value);
    columna2.append(value2.value);
    columna3.append(value3.value);
    fila.append(columna1, columna2, columna3);
    tabla.append(fila);


    cambiarDisplay(value1, false);
    value1.value = " ";
    cambiarDisplay(value2, false);
    value2.value = " ";
    cambiarDisplay(value3, false)
    value3.value = " ";
    cambiarDisplay( document.getElementById("botonIngresar"), false);
}