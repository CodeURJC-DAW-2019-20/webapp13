mapboxgl.accessToken = 'pk.eyJ1Ijoicm9kZGVzaXF1ZWlyYSIsImEiOiJjazV3YzJzNzcwazdqM2huM3UyazRkODZuIn0.arapReUjfPDd-jwJriqd3Q';
var map = new mapboxgl.Map({
    container: 'map', // container id
    style: 'mapbox://styles/roddesiqueira/ck5wdrx7v0r1o1ink55jz9e91', //stylesheet location
    center: [11.255, 43.77], // starting position
    zoom: 13 // starting zoom
});

map.on("load", function () {
    /* Image: An image is loaded and added to the map. */
    map.loadImage("https://i.imgur.com/MK4NUzI.png", function (error, image) {
        if (error) throw error;
        map.addImage("custom-marker", image);
        /* Style layer: A style layer ties together the source and image and specifies how they are displayed on the map. */
        map.addLayer({
            id: "markers",
            type: "symbol",
            /* Source: A data source specifies the geographic coordinate where the image marker gets placed. */
            source: {
                type: "geojson",
                data: {
                    type: 'FeatureCollection',
                    features: [
                        {
                            type: 'Feature',
                            properties: {},
                            geometry: {
                                type: "Point",
                                coordinates: [-73.9987, 40.7204]
                            }
                        }
                    ]
                }
            },
            layout: {
                "icon-image": "custom-marker",
            }
        });
    });
});

map.addControl(new mapboxgl.FullscreenControl());