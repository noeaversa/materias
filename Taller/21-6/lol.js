function concatenarArea(area){
    let texto = "Area: " + area.toString();
    return texto;
}

function borrarTexto(texto){
    texto.innerHTML = " ";
}

function mostrarArea(elemento, areaTotal){
    elemento.append(areaTotal);
}

function CalculoAreaCirculo(radio){
    let textoCirculo = document.getElementById("textoCirculo");
    let area = Math.PI * radio * radio;
    let texto = concatenarArea(area);
    borrarTexto(textoCirculo);
    mostrarArea(textoCirculo, texto);
}

function CalculoAreaEsfera(radio){
    let textoEsfera = document.getElementById("textoEsfera");
    let area = 4 * Math.PI * radio * radio;
    let texto = concatenarArea(area);
    borrarTexto(textoEsfera);
    mostrarArea(textoEsfera, texto);
}

function CalculoAreaCuadrado(lado){
    let textoCuadrado = document.getElementById("textoCuadrado");
    let area = lado * lado;
    let texto = concatenarArea(area);
    borrarTexto(textoCuadrado);
    mostrarArea(textoCuadrado, texto);
}

function CalculoAreaCubo(lado){
    let textoCubo = document.getElementById("textoCubo");
    let area = 6 * lado * lado;
    let texto = concatenarArea(area);
    borrarTexto(textoCubo);
    mostrarArea(textoCubo, texto);
}

function CalculoAreaTriangulo(altura, base){
    let textoTriangulo = document.getElementById("textoTriangulo");
    let area = (base * altura) / 2;
    let texto = concatenarArea(area);
    borrarTexto(textoTriangulo);    
    mostrarArea(textoTriangulo, texto);
}