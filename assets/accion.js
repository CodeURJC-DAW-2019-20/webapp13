function closeEvent() {
    document.getElementById('Event_Panel').style.display ="none"
}
function openEvent(){
    document.getElementById('Event_Panel').style.display ="block"
}
function mostrarArtistas() {
    document.getElementById('eventos').style.display="none";
    document.getElementById('artistas').style.display="block";
    document.getElementById('noticias').style.display="none";

}
function mostrarFestivales() {
    document.getElementById('artistas').style.display="none";
    document.getElementById('eventos').style.display="block";
    document.getElementById('noticias').style.display="none";
}
function mostrarNoticias() {
    document.getElementById('artistas').style.display="none";
    document.getElementById('eventos').style.display="none";
    document.getElementById('noticias').style.display="block";
}