
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*15.70*/routes/*15.76*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*15.126*/("""">
        <script type="text/javascript" src=""""),_display_(/*16.46*/routes/*16.52*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*16.101*/(""""></script>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">MPManager</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                  <li class="nav-item active">
                    <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
                  </li>
                  <li class="nav-item active">
                    <a class="nav-link" href="/listar">Atividades</a>
                  </li>
                </ul>
            </div>

        </nav>
        <div class="container">
        <br>
        """),format.raw/*41.32*/("""
        """),_display_(/*42.10*/content),format.raw/*42.17*/("""

        """),format.raw/*44.9*/("""<script src=""""),_display_(/*44.23*/routes/*44.29*/.Assets.versioned("javascripts/main.js")),format.raw/*44.69*/("""" type="text/javascript"></script>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 05 00:05:50 BRT 2017
                  SOURCE: C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/app/views/main.scala.html
                  HASH: c24f412613df548efc5e3a2619e9a7a6936dfe7f
                  MATRIX: 1211->266|1336->296|1366->300|1449->408|1486->418|1521->426|1547->431|1637->494|1652->500|1715->541|1815->614|1830->620|1902->670|1978->719|1993->725|2064->774|2162->845|2177->851|2238->890|3278->1993|3316->2004|3344->2011|3383->2023|3424->2037|3439->2043|3500->2083
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|71->41|72->42|72->42|74->44|74->44|74->44|74->44
                  -- GENERATED --
              */
          