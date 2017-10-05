
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
	"""),format.raw/*6.2*/("""<h1>Editar Atividade</h1>
	"""),_display_(/*7.3*/helper/*7.9*/.form(action = helper.CSRF(routes.AtividadeController.saveEdit()))/*7.75*/ {_display_(Seq[Any](format.raw/*7.77*/("""
		"""),format.raw/*8.3*/("""<fieldset>
		<!-- <legend>Atividade """),_display_(/*9.27*/atividadeForm("Id")),format.raw/*9.46*/("""</legend> -->
		"""),_display_(/*10.4*/helper/*10.10*/.inputText(atividadeForm("Id"), 'readonly -> "readonly")),format.raw/*10.66*/("""
		"""),_display_(/*11.4*/helper/*11.10*/.inputText(atividadeForm("Data"), 'size -> 30)),format.raw/*11.56*/("""
		"""),_display_(/*12.4*/helper/*12.10*/.inputText(atividadeForm("Status"), 'size -> 30)),format.raw/*12.58*/("""
		"""),_display_(/*13.4*/helper/*13.10*/.textarea(atividadeForm("Descricao"), 'cols -> 60)),format.raw/*13.60*/("""
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
                  DATE: Wed Oct 04 23:54:50 BRT 2017
                  SOURCE: C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/app/views/edit.scala.html
                  HASH: 7aa5a6164c83081f795b02d5c5441da8444073db
                  MATRIX: 956->1|1061->36|1106->33|1134->52|1161->54|1196->81|1235->83|1263->85|1316->113|1329->119|1403->185|1442->187|1471->190|1534->227|1573->246|1616->263|1631->269|1708->325|1738->329|1753->335|1820->381|1850->385|1865->391|1934->439|1964->443|1979->449|2050->499|2080->502|2168->560|2200->562
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|40->8|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|48->16|49->17
                  -- GENERATED --
              */
          