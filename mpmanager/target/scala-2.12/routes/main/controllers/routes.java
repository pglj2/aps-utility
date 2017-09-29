
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/conf/routes
// @DATE:Fri Sep 29 00:09:53 BRT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCadastroAtividadeController CadastroAtividadeController = new controllers.ReverseCadastroAtividadeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAtividadeController AtividadeController = new controllers.ReverseAtividadeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCalendarioController CalendarioController = new controllers.ReverseCalendarioController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCadastroAtividadeController CadastroAtividadeController = new controllers.javascript.ReverseCadastroAtividadeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAtividadeController AtividadeController = new controllers.javascript.ReverseAtividadeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCalendarioController CalendarioController = new controllers.javascript.ReverseCalendarioController(RoutesPrefix.byNamePrefix());
  }

}
