$(function()
{
    var numPage = 1;
    document.cookie.split('; ').forEach(function(cookieString)
    {
        //console.log(cookieString);
        var cookie = cookieString.split("=");
        if ((cookie.length === 2) && (cookie[0] === "authToken"))
        {
            window.authToken = cookie[1];
            console.log(window.authToken);
        }
    });
    //Reemplazar por la url de Amazon...
    var UrlImagen = "http://localhost:8887/maestria/base/img/portada/";
    var baseItem = function(data)
    {
        //debugger;
        //http://localhost:9000/api/recursos/50
        var urlDetalle = "api/recursos/" + data.id;
        var imagen = UrlImagen + "/" + data.imagen;
        var txt = '<div class="col-sm-4 col-lg-4 col-md-4">' +
                  '<div class="thumbnail">' +
                  '<img src = "'+(imagen)+'" alt="">' +
                  '<div class="caption">' +
                  '<h4 class="pull-right">$'+(data.precioActual)+'</h4>' +
                  '<h4><a href="'+(urlDetalle)+'">'+(data.nombre)+'</a>' +
                  '</h4>' +
                  '<p>'+(data.descripcion)+'</p>' +
                  '<button type="button" class="btn btn-primary text-center">' +
                  '<span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span> Añadir al carrito</button>' +
                  '</div>' +
                  '<div class="ratings">' +
                  '<p class="pull-right">'+(data.puntuacion)+'</p>' +
                  '<p>';
        //Para las estrellas...
        for(var i = 1; i <= 5; i++)
        {
            txt += '<span class = "glyphicon ' + (i <= data.puntuacion ? 'glyphicon-star' : 'glyphicon-star-empty' ) + '"></span>';
            //console.log(i);
        }
        txt += '</p></div></div></div>';
        return txt;
    };

    /*
    $("#tipoSel").change(function(e){
        elementos();
    });
    */

    var paginacion = function(valor)
    {
        console.log(numPage, valor);
        if(numPage + valor >= 1)
        {
            $(".previous").removeClass("disabled");
            numPage += valor;
            elementos();
        }
        else
        {
            $(".previous").addClass("disabled");
        }
    };

    $(".previous").click(function(e)
    {
        if($(".next").hasClass("disabled"))
        {
            $(".next").removeClass("disabled");
        }
        paginacion(-1);
    });

    $(".next").click(function(e){
        paginacion(1);
    });

    var elementos = (function elementos()
    {
        //Para validar la paginación...
        //var url = "/api/producto/numpage/" + numPage + "/" + $("#tipoSel").val();
        var url = "/api/producto/numpage/" + numPage + "/SER";
        console.log(url);
        $.getJSON(url, function(data)
        {
            console.log(data);
            if(data.errorCode === undefined)
            {
                $("#catalog").html("");
                data.forEach(function(item)
                {
                    $("#catalog").append(baseItem(item));
                });
            }
            else
            {
                numPage--;
                $(".next").addClass("disabled");

            }
            //console.log(data);
        });
        return elementos;


        /*
        $("#catalog").html("");
        $.getJSON("/api/productos/" + $("#tipoSel").val(), function(data)
        {
            //console.log(data);
            data.forEach(function(item)
            {
                $("#catalog").append(baseItem(item));
            });
        });
        return elementos;
        */
    })();

    $("#logout").click(function(event)
    {
        console.log("LLega", window.authToken);
        $.ajax(
        {
            url 		: "/logout",
            type 		: "POST",
            dataType 	: "json",
            headers     : {"X-AUTH-TOKEN": window.authToken}
        }).done(function(data)
        {
            //console.log(data);
            window.location = "/login";
            //window.location.href = "/catalog"
            //console.log(data.authToken);
            //window.authToken = data.authToken;
        }).error(function(request, status, error)
        {
            //console.log(request);
            //console.log(status);
            //console.log(error);
            //sweetAlert("Error", "No ha sido posible realizar la autenticación!", "error");
            //console.log("Error...");
            window.location = "/login";
        });
    });
});
