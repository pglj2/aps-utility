
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/conf/routes
// @DATE:Thu Sep 28 00:42:58 BRT 2017

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
  Assets_1: controllers.Assets,
  // @LINE:14
  AtividadeController_2: controllers.AtividadeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:14
    AtividadeController_2: controllers.AtividadeController
  ) = this(errorHandler, HomeController_0, Assets_1, AtividadeController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, AtividadeController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atividades""", """controllers.AtividadeController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atividades/new""", """controllers.AtividadeController.showBlank()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atividades/""" + "$" + """id<[^/]+>""", """controllers.AtividadeController.show(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atividades""", """controllers.AtividadeController.save()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """atividades/edit""", """controllers.AtividadeController.saveEdit()"""),
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
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:14
  private[this] lazy val controllers_AtividadeController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atividades")))
  )
  private[this] lazy val controllers_AtividadeController_list2_invoker = createInvoker(
    AtividadeController_2.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "list",
      Nil,
      "GET",
      this.prefix + """atividades""",
      """ Atividade Routes""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AtividadeController_showBlank3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atividades/new")))
  )
  private[this] lazy val controllers_AtividadeController_showBlank3_invoker = createInvoker(
    AtividadeController_2.showBlank(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "showBlank",
      Nil,
      "GET",
      this.prefix + """atividades/new""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AtividadeController_show4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atividades/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_show4_invoker = createInvoker(
    AtividadeController_2.show(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "show",
      Seq(classOf[String]),
      "GET",
      this.prefix + """atividades/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AtividadeController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atividades")))
  )
  private[this] lazy val controllers_AtividadeController_save5_invoker = createInvoker(
    AtividadeController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "save",
      Nil,
      "POST",
      this.prefix + """atividades""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AtividadeController_saveEdit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("atividades/edit")))
  )
  private[this] lazy val controllers_AtividadeController_saveEdit6_invoker = createInvoker(
    AtividadeController_2.saveEdit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "saveEdit",
      Nil,
      "POST",
      this.prefix + """atividades/edit""",
      """""",
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
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_AtividadeController_list2_route(params) =>
      call { 
        controllers_AtividadeController_list2_invoker.call(AtividadeController_2.list)
      }
  
    // @LINE:15
    case controllers_AtividadeController_showBlank3_route(params) =>
      call { 
        controllers_AtividadeController_showBlank3_invoker.call(AtividadeController_2.showBlank())
      }
  
    // @LINE:16
    case controllers_AtividadeController_show4_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AtividadeController_show4_invoker.call(AtividadeController_2.show(id))
      }
  
    // @LINE:17
    case controllers_AtividadeController_save5_route(params) =>
      call { 
        controllers_AtividadeController_save5_invoker.call(AtividadeController_2.save())
      }
  
    // @LINE:18
    case controllers_AtividadeController_saveEdit6_route(params) =>
      call { 
        controllers_AtividadeController_saveEdit6_invoker.call(AtividadeController_2.saveEdit())
      }
  }
}
