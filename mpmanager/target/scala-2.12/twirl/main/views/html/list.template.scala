
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
	"""),format.raw/*3.2*/("""<h1>Lista de Atividades</h1>
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

    <!-- <button type="button" href=""""),_display_(/*15.39*/routes/*15.45*/.CadastroAtividadeController.showBlank()),format.raw/*15.85*/("""" class="btn btn-primary">Teste</button> -->
    <a class="btn btn-primary" href="/cadastro/atividades" role="button">Cadastrar Atividade</a>

	<!-- <a href=""""),_display_(/*18.17*/routes/*18.23*/.CadastroAtividadeController.showBlank()),format.raw/*18.63*/("""" class="btn">
	<i class="icon-plus"></i> New atividade</a> -->
""")))}),format.raw/*20.2*/("""
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
                  DATE: Wed Oct 04 22:41:57 BRT 2017
                  SOURCE: C:/Users/hosqu/Documents/Projetos Ativos/APS/aps-utility/mpmanager/app/views/list.scala.html
                  HASH: 4fed7cb48bb1ca62e909a79494b131e6e81866bd
                  MATRIX: 955->1|1078->29|1105->31|1141->59|1180->61|1208->63|1270->100|1313->128|1352->130|1381->133|1425->151|1439->157|1498->196|1531->204|1548->213|1571->216|1599->217|1628->220|1645->229|1670->234|1698->235|1727->238|1744->247|1771->254|1801->258|1847->278|1865->287|1896->297|1934->305|1963->307|2035->352|2050->358|2111->398|2297->557|2312->563|2373->603|2468->668
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12|45->13|47->15|47->15|47->15|50->18|50->18|50->18|52->20
                  -- GENERATED --
              */
          