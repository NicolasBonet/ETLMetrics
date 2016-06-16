$(function()
{
    //Capturar los datos del producto...
    var servicio = JSON.parse($("#dataType").html());
    var idProducto = servicio[0].idProducto;

    var comentarios = (function elementos()
    {
        //Para validar la paginación...
        //var url = /api/comentarios/:productoId/:numPagina
        var url = "/api/comentarios/" + idProducto + "/0";
        console.log(url);
        $.getJSON(url, function(data)
        {
            console.log(data);
            if(data.errorCode === undefined)
            {
                $("#comentarios").html("");

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

    })();

    var baseItem = function(data)
    {
        //debugger;
        //http://localhost:9000/api/recursos/50

        var txt = '<div class="col-sm-4 col-lg-4 col-md-4">' +
            '<div class="thumbnail">' +
            '<div class="caption">' +
            '</h4>' +
            '<p>'+(data.texto)+'</p>' +
            '</div>';
        txt += '</p></div>';
        console.log("txt" + txt);
        return txt;
    };

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
    console.log(servicio);


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
            window.location = "/login";
        }).error(function(request, status, error)
        {
            window.location = "/login";
        });
    });
});
