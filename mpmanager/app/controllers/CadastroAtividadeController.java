package controllers;

import fachada.Fachada;
import models.Atividade;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.show;

import javax.inject.Inject;

public class CadastroAtividadeController extends Controller {
    private FormFactory formFactory;
    private Fachada fachada;

    @Inject
    public CadastroAtividadeController(FormFactory formFactory) {
        this.formFactory = formFactory;
        this.fachada = Fachada.getInstance();
    }

    public Result showBlank() {
        Form<Atividade> atividadeForm = formFactory.form(Atividade.class);
        return ok(show.render(atividadeForm));
    }

    public Result save() {
        Atividade atividade = formFactory.form(Atividade.class).bindFromRequest().get();
        fachada.cadastrarAtividade(atividade);
        return ok("Saved atividade: "+atividade);
    }
}
