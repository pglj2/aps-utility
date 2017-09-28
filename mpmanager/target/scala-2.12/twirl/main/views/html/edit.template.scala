
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Atividade],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(atividadeForm: Form[Atividade]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Edit Atividade Form")/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
	"""),format.raw/*6.2*/("""<h1>Edit Atividade Form</h1>
	"""),_display_(/*7.3*/helper/*7.9*/.form(action = helper.CSRF(routes.AtividadeController.saveEdit()))/*7.75*/ {_display_(Seq[Any](format.raw/*7.77*/("""
		"""),format.raw/*8.3*/("""<fieldset>
		<legend>Atividade """),_display_(/*9.22*/atividadeForm("Id")),format.raw/*9.41*/("""</legend>
		"""),_display_(/*10.4*/helper/*10.10*/.inputText(atividadeForm("Id"), 'readonly -> "readonly")),format.raw/*10.66*/("""
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
                  DATE: Thu Sep 28 00:52:11 BRT 2017
                  SOURCE: C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/app/views/edit.scala.html
                  HASH: 0fcac80c13fb29e1babbcbf90b75891275e132fb
                  MATRIX: 956->1|1061->36|1106->33|1134->52|1161->54|1196->81|1235->83|1263->85|1319->116|1332->122|1406->188|1445->190|1474->193|1532->225|1571->244|1610->257|1625->263|1702->319|1732->323|1747->329|1801->362|1831->366|1846->372|1902->407|1932->411|1947->417|2005->454|2035->457|2123->515|2155->517
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|40->8|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|48->16|49->17
                  -- GENERATED --
              */
          