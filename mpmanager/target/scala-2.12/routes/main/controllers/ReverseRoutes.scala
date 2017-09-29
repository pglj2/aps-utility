
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/conf/routes
// @DATE:Fri Sep 29 00:09:53 BRT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:21
  class ReverseCadastroAtividadeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "cadastro/atividades")
    }
  
    // @LINE:21
    def showBlank(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cadastro/atividades")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:16
  class ReverseAtividadeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def show(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "atividades/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:18
    def saveEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "atividades/edit")
    }
  
  }

  // @LINE:25
  class ReverseCalendarioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calendario")
    }
  
  }


}
