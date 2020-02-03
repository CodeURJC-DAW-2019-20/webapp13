function closeEvent() {
    document.getElementById('Event_Panel').style.display ="none"
}
function openEvent(){
    document.getElementById('Event_Panel').style.display ="block"
}
function mostrarArtistas() {
    document.getElementById('eventos').style.display="none";
    document.getElementById('artistas').style.display="block";

}
function mostrarFestivales() {
    document.getElementById('artistas').style.display="none";
    document.getElementById('eventos').style.display="block";
}