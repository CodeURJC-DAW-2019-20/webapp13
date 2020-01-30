// JavaScript source code
function mostrarArtistas() {
    var status = document.getElementById('Artistas').style.display;
    if (status === "block") {
        document.getElementById('Artistas').style.display = "none"
    } else {
        document.getElementById('Festivales').style.display = "none";
        document.getElementById('Artistas').style.display = "block";
    }
}
function mostrarFestivales() {
    var status = document.getElementById('Festivales').style.display;
    if (status === "block") {
        document.getElementById('Festivales').style.display = "none"
    } else {
        document.getElementById('Artistas').style.display = "none";
        document.getElementById('Festivales').style.display = "block";
    }
}