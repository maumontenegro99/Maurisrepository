// to get current year
function getYear() {
    var currentDate = new Date();
    var currentYear = currentDate.getFullYear();
    document.querySelector("#displayYear").innerHTML = currentYear;
}

getYear();


// isotope js
$(window).on('load', function () {
    $('.filters_menu li').click(function () {
        $('.filters_menu li').removeClass('active');
        $(this).addClass('active');

        var data = $(this).attr('data-filter');
        $grid.isotope({
            filter: data
        })
    });

    var $grid = $(".grid").isotope({
        itemSelector: ".all",
        percentPosition: false,
        masonry: {
            columnWidth: ".all"
        }
    })
});

// nice select
$(document).ready(function() {
    $('select').niceSelect();
  });

/** google_map js **/
function myMap() {
    var mapProp = {
        center: new google.maps.LatLng(40.712775, -74.005973),
        zoom: 18,
    };
    var map = new google.maps.Map(document.getElementById("googleMap"), mapProp);
}

// client section owl carousel
$(".client_owl-carousel").owlCarousel({
    loop: true,
    margin: 0,
    dots: false,
    nav: true,
    navText: [],
    autoplay: true,
    autoplayHoverPause: true,
    navText: [
        '<i class="fa fa-angle-left" aria-hidden="true"></i>',
        '<i class="fa fa-angle-right" aria-hidden="true"></i>'
    ],
    responsive: {
        0: {
            items: 1
        },
        768: {
            items: 2
        },
        1000: {
            items: 2
        }
    }
});


var form = document.getElementById('formulario');
error.style.color = "red"
    form.addEventListener('submit',function(evt){
        evt.preventDefault();
        var mensajesError =[];
        error.style.color = "red"

    if(nombre.value === null || nombre.value === ''){
        mensajesError.push('Ingresa tu nombre');
    }

    if(telefono.value === null || telefono.value === ''){
        mensajesError.push('Ingresa tu telefono');
    }

    if(correo.value === null || correo.value === ''){
        mensajesError.push('Ingresa tu correo');
    }

    if(personas.value === null || personas.value === ''){
        mensajesError.push('Ingrese una cantidad');
    }

    if(fecha.value === null || fecha.value === ''){
        mensajesError.push('Ingrese fecha');
    }

    error.innerHTML = mensajesError.join(' ,  ');



    });
