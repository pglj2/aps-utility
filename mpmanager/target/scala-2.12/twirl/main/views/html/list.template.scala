
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Atividade],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(atividades: Set[Atividade]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*2.2*/main("Atividades Catalogue")/*2.30*/ {_display_(Seq[Any](format.raw/*2.32*/("""
	"""),format.raw/*3.2*/("""<h1>All Atividades</h1>
	<dl>
	"""),_display_(/*5.3*/for(atividade <- atividades) yield /*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
		"""),format.raw/*6.3*/("""<dt>
			<a href=""""),_display_(/*7.14*/routes/*7.20*/.AtividadeController.show(atividade.id)),format.raw/*7.59*/("""">
				"""),_display_(/*8.6*/atividade/*8.15*/.id),format.raw/*8.18*/(""" """),format.raw/*8.19*/("""- """),_display_(/*8.22*/atividade/*8.31*/.data),format.raw/*8.36*/(""" """),format.raw/*8.37*/("""- """),_display_(/*8.40*/atividade/*8.49*/.status),format.raw/*8.56*/("""
			"""),format.raw/*9.4*/("""</a>
		</dt>
		<dd>"""),_display_(/*11.8*/atividade/*11.17*/.descricao),format.raw/*11.27*/("""</dd>
	""")))}),format.raw/*12.3*/("""
	"""),format.raw/*13.2*/("""</dl>

	<a href=""""),_display_(/*15.12*/routes/*15.18*/.AtividadeController.showBlank()),format.raw/*15.50*/("""" class="btn">
	<i class="icon-plus"></i> New atividade</a>
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(atividades:Set[Atividade]): play.twirl.api.HtmlFormat.Appendable = apply(atividades)

  def f:((Set[Atividade]) => play.twirl.api.HtmlFormat.Appendable) = (atividades) => apply(atividades)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Sep 28 00:24:00 BRT 2017
                  SOURCE: C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/app/views/list.scala.html
                  HASH: cd382cc13fcea2c0766a8d643bb77702412dcf73
                  MATRIX: 955->1|1078->29|1105->31|1141->59|1180->61|1208->63|1265->95|1308->123|1347->125|1376->128|1420->146|1434->152|1493->191|1526->199|1543->208|1566->211|1594->212|1623->215|1640->224|1665->229|1693->230|1722->233|1739->242|1766->249|1796->253|1842->273|1860->282|1891->292|1929->300|1958->302|2003->320|2018->326|2071->358|2162->419
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12|45->13|47->15|47->15|47->15|49->17
                  -- GENERATED --
              */
          