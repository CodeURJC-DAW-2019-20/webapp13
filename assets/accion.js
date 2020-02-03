function closeEvent() {
    document.getElementById('Event_Panel').style.display ="none"
}
function openEvent(){
    document.getElementById('Event_Panel').style.display ="block"
}
function showArtist() {
    document.getElementById('eventos').style.display="none";
    document.getElementById('artistas').style.display="block";
    document.getElementById('noticias').style.display="none";

}
function showFestivals() {
    document.getElementById('artistas').style.display="none";
    document.getElementById('eventos').style.display="block";
    document.getElementById('noticias').style.display="none";
}
function showNews() {
    document.getElementById('artistas').style.display="none";
    document.getElementById('eventos').style.display="none";
    document.getElementById('noticias').style.display="block";
}