/**
 * Created by jorgerubiano on 6/03/16.
 */
$(function()
{
    document.cookie.split('; ').forEach(function(cookieString)
    {
        //console.log(cookieString);
        var cookie = cookieString.split("=");
        console.log(cookie);
        console.log(cookie.length, cookie[0]);
        if ((cookie.length === 2) && (cookie[0] === "authToken"))
        {
            window.authToken = cookie[1];
            console.log(window.authToken);
        }
    });

    //87a631d2-cacf-44b1-b38c-515a316b46c9
    /*
    if (window.authToken === undefined)
    {

    }
    */
    //console.log(window.authToken);

    $( "#form" ).submit(function( event )
    {
        var dataUser = {
                            correo : $("#inputEmail").val(),
                            clave : $("#inputPassword").val()
        };
        $.ajax(
        {
            url 		: "/login",
            type 		: "POST",
            data 		: JSON.stringify(dataUser),
            dataType 	: "json",
            contentType: "application/json; charset=utf-8"
        }).done(function(data)
        {
            //console.log(data);
            window.location.href = "/catalog"
            console.log(data.authToken);
        }).error(function(request, status, error)
        {
            sweetAlert("Error", "No ha sido posible realizar la autenticación!", "error");
        });
        event.preventDefault();
    });
});