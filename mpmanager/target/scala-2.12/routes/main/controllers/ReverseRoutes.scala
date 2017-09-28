
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/conf/routes
// @DATE:Thu Sep 28 00:42:58 BRT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

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

  // @LINE:14
  class ReverseAtividadeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def show(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "atividades/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:14
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "atividades")
    }
  
    // @LINE:17
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "atividades")
    }
  
    // @LINE:15
    def showBlank(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "atividades/new")
    }
  
    // @LINE:18
    def saveEdit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "atividades/edit")
    }
  
  }

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


}
