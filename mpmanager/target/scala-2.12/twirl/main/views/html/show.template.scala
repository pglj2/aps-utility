
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Atividade],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(atividadeForm: Form[Atividade]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Atividade Form")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
	"""),format.raw/*6.2*/("""<h1>Atividade Form</h1>
	"""),_display_(/*7.3*/helper/*7.9*/.form(action = helper.CSRF(routes.CadastroAtividadeController.save()))/*7.79*/ {_display_(Seq[Any](format.raw/*7.81*/("""
		"""),format.raw/*8.3*/("""<fieldset>
		<legend>Atividade """),_display_(/*9.22*/atividadeForm("Id")/*9.41*/.valueOr("(New Atividade)")),format.raw/*9.68*/("""</legend>
		"""),_display_(/*10.4*/helper/*10.10*/.inputText(atividadeForm("Id"))),format.raw/*10.41*/("""
		"""),_display_(/*11.4*/helper/*11.10*/.inputText(atividadeForm("Data"))),format.raw/*11.43*/("""
		"""),_display_(/*12.4*/helper/*12.10*/.inputText(atividadeForm("Status"))),format.raw/*12.45*/("""
		"""),_display_(/*13.4*/helper/*13.10*/.textarea(atividadeForm("Descricao"))),format.raw/*13.47*/("""
		"""),format.raw/*14.3*/("""</fieldset>
		<input type="Submit" class="btn primary">
	""")))}),format.raw/*16.3*/("""
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(atividadeForm:Form[Atividade]): play.twirl.api.HtmlFormat.Appendable = apply(atividadeForm)

  def f:((Form[Atividade]) => play.twirl.api.HtmlFormat.Appendable) = (atividadeForm) => apply(atividadeForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Sep 28 23:42:32 BRT 2017
                  SOURCE: C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/app/views/show.scala.html
                  HASH: 77910a6c17d02f185a34c0e1dab2ddbd5a96e325
                  MATRIX: 956->1|1061->36|1106->33|1134->52|1161->54|1191->76|1230->78|1258->80|1309->106|1322->112|1400->182|1439->184|1468->187|1526->219|1553->238|1600->265|1639->278|1654->284|1706->315|1736->319|1751->325|1805->358|1835->362|1850->368|1906->403|1936->407|1951->413|2009->450|2039->453|2127->511|2159->513
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|48->16|49->17
                  -- GENERATED --
              */
          