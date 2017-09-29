package controllers;

import fachada.Fachada;
import models.Atividade;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.list;
import views.html.show;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CalendarioController extends Controller {
    private FormFactory formFactory;
    private Fachada fachada;

    @Inject
    public CalendarioController(FormFactory formFactory) {
        this.formFactory = formFactory;
        this.fachada = Fachada.getInstance();
    }

    public Result list() {
        Set<Atividade> setOfAtividades = new HashSet<Atividade>(this.fachada.buscarTodasAtividades());
        return ok(list.render(setOfAtividades));
    }
}
