
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
	"""),format.raw/*6.2*/("""<h1>Cadastrar Atividade</h1>
	"""),_display_(/*7.3*/helper/*7.9*/.form(action = helper.CSRF(routes.CadastroAtividadeController.save()))/*7.79*/ {_display_(Seq[Any](format.raw/*7.81*/("""
		"""),format.raw/*8.3*/("""<fieldset>
		<!-- <legend>Atividade """),_display_(/*9.27*/atividadeForm("Id")/*9.46*/.valueOr("(New Atividade)")),format.raw/*9.73*/("""</legend> -->
		"""),_display_(/*10.4*/helper/*10.10*/.inputText(atividadeForm("Data"), 'size -> 30)),format.raw/*10.56*/("""
		"""),_display_(/*11.4*/helper/*11.10*/.textarea(atividadeForm("Descricao"), 'cols -> 60)),format.raw/*11.60*/("""
		"""),format.raw/*12.3*/("""</fieldset>
		<input type="Submit" class="btn primary">
	""")))}),format.raw/*14.3*/("""
""")))}),format.raw/*15.2*/("""
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
                  DATE: Wed Oct 04 23:38:51 BRT 2017
                  SOURCE: C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/app/views/show.scala.html
                  HASH: ea704cf884e250ae75a5048cb8367024bee4fdd1
                  MATRIX: 956->1|1061->36|1106->33|1134->52|1161->54|1191->76|1230->78|1258->80|1314->111|1327->117|1405->187|1444->189|1473->192|1536->229|1563->248|1610->275|1653->292|1668->298|1735->344|1765->348|1780->354|1851->404|1881->407|1969->465|2001->467
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|46->14|47->15
                  -- GENERATED --
              */
          