
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/conf/routes
// @DATE:Wed Oct 04 23:55:43 BRT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_4: controllers.Assets,
  // @LINE:16
  AtividadeController_3: controllers.AtividadeController,
  // @LINE:21
  CadastroAtividadeController_1: controllers.CadastroAtividadeController,
  // @LINE:26
  CalendarioController_2: controllers.CalendarioController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_4: controllers.Assets,
    // @LINE:16
    AtividadeController_3: controllers.AtividadeController,
    // @LINE:21
    CadastroAtividadeController_1: controllers.CadastroAtividadeController,
    // @LINE:26
    CalendarioController_2: controllers.CalendarioController
  ) = this(errorHandler, HomeController_0, Assets_4, AtividadeController_3, CadastroAtividadeController_1, CalendarioController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_4, AtividadeController_3, CadastroAtividadeController_1, CalendarioController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atividades/""" + "$" + """id<[^/]+>""", """controllers.AtividadeController.show(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atividades/edit""", """controllers.AtividadeController.saveEdit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastro/atividades""", """controllers.CadastroAtividadeController.showBlank()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cadastro/atividades""", """controllers.CadastroAtividadeController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listar""", """controllers.CalendarioController.list()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AtividadeController_show2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atividades/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_show2_invoker = createInvoker(
    AtividadeController_3.show(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "show",
      Seq(classOf[String]),
      "GET",
      this.prefix + """atividades/""" + "$" + """id<[^/]+>""",
      """ Atividade Routes
 GET       /atividades                 controllers.AtividadeController.list
 GET       /atividades/new             controllers.AtividadeController.showBlank()""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AtividadeController_saveEdit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atividades/edit")))
  )
  private[this] lazy val controllers_AtividadeController_saveEdit3_invoker = createInvoker(
    AtividadeController_3.saveEdit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "saveEdit",
      Nil,
      "POST",
      this.prefix + """atividades/edit""",
      """ POST      /atividades                 controllers.AtividadeController.save()""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CadastroAtividadeController_showBlank4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastro/atividades")))
  )
  private[this] lazy val controllers_CadastroAtividadeController_showBlank4_invoker = createInvoker(
    CadastroAtividadeController_1.showBlank(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CadastroAtividadeController",
      "showBlank",
      Nil,
      "GET",
      this.prefix + """cadastro/atividades""",
      """ CadastroAtividade Routes""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CadastroAtividadeController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cadastro/atividades")))
  )
  private[this] lazy val controllers_CadastroAtividadeController_save5_invoker = createInvoker(
    CadastroAtividadeController_1.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CadastroAtividadeController",
      "save",
      Nil,
      "POST",
      this.prefix + """cadastro/atividades""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_CalendarioController_list6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listar")))
  )
  private[this] lazy val controllers_CalendarioController_list6_invoker = createInvoker(
    CalendarioController_2.list(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalendarioController",
      "list",
      Nil,
      "GET",
      this.prefix + """listar""",
      """ Calendario Routes""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_AtividadeController_show2_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AtividadeController_show2_invoker.call(AtividadeController_3.show(id))
      }
  
    // @LINE:18
    case controllers_AtividadeController_saveEdit3_route(params) =>
      call { 
        controllers_AtividadeController_saveEdit3_invoker.call(AtividadeController_3.saveEdit())
      }
  
    // @LINE:21
    case controllers_CadastroAtividadeController_showBlank4_route(params) =>
      call { 
        controllers_CadastroAtividadeController_showBlank4_invoker.call(CadastroAtividadeController_1.showBlank())
      }
  
    // @LINE:22
    case controllers_CadastroAtividadeController_save5_route(params) =>
      call { 
        controllers_CadastroAtividadeController_save5_invoker.call(CadastroAtividadeController_1.save())
      }
  
    // @LINE:26
    case controllers_CalendarioController_list6_route(params) =>
      call { 
        controllers_CalendarioController_list6_invoker.call(CalendarioController_2.list())
      }
  }
}
