package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.login;
import views.html.catalog;

public class Application extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result login() {
        return ok(login.render("Login ScriptToForm"));
    }

    public Result catalog() {
        return ok(catalog.render("Catálogo ScriptToForm"));
    }

}
