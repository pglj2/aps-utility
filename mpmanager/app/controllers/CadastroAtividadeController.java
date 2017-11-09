package controllers;

import fachada.Fachada;
import models.Atividade;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.answer;
import views.html.list;
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
        atividade.setId((Atividade.findAll().size()+1)+"");
        atividade.setStatus("Em aberto");
        fachada.cadastrarAtividade(atividade);
        //return ok("Saved atividade: "+atividade);
        //return ok(list.render(Atividade.findAll()));
        //return ok("<meta http-equiv=\"refresh\" content=\"5; url=/calendario\">");
        return ok(answer.render());
    }
}
