package controllers;

import fachada.Fachada;
import play.mvc.*;
import java.util.*;
import models.*;
import views.html.*;
import play.data.*;
import javax.inject.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class AtividadeController extends Controller {
    private FormFactory formFactory;
    private Atividade atividades;
    private Fachada fachada;

    @Inject
    public AtividadeController(FormFactory formFactory) {
        this.formFactory = formFactory;
        atividades = new Atividade();
        this.fachada = Fachada.getInstance();
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result list() {
        Set<Atividade> setOfAtividades = atividades.findAll();
        return ok(list.render(setOfAtividades));
    }

    public Result showBlank() {
   	    Form<Atividade> atividadeForm = formFactory.form(Atividade.class);
   		  return ok(show.render(atividadeForm));
   	}

    public Result show(String id) {
  		  //Atividade atividade = Atividade.findById(id);
  		  Atividade atividade = this.fachada.buscarAtividadePorId(id);
          if (atividade == null) {
  			   return notFound("Atividade "+id+" does not exist.");
  		  }
  		  Form<Atividade> atividadeForm = formFactory.form(Atividade.class);
  		  Form<Atividade> filledForm = atividadeForm.fill(atividade);
  		  //return ok(show.render(filledForm));
        return ok(edit.render(filledForm));
  	}

    public Result save() {
  		Atividade atividade = formFactory.form(Atividade.class).bindFromRequest().get();
  		Atividade.add(atividade);
  		return ok("Saved atividade: "+atividade);
  	}

    public Result saveEdit() {
  		Atividade atividade = formFactory.form(Atividade.class).bindFromRequest().get();
        //Atividade findAtividade = Atividade.findById(atividade.id);
        Atividade findAtividade = this.fachada.buscarAtividadePorId(atividade.id);
        findAtividade.setData(atividade.data);
        findAtividade.setStatus(atividade.status);
        findAtividade.setDescricao(atividade.descricao);
  		//return ok("Saved atividade: "+findAtividade);
        return ok(answer.render());
  	}
}
