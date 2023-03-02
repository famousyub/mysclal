
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
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[UserInfo],UserRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[UserInfo])(implicit request: UserRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("play-scala-secure-session-example")/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""

    """),_display_(/*5.6*/request/*5.13*/.flash.data.map/*5.28*/{ case (k, v) =>_display_(Seq[Any](format.raw/*5.44*/("""
    """),format.raw/*6.5*/("""<p>
        """),_display_(/*7.10*/k),format.raw/*7.11*/(""": """),_display_(/*7.14*/v),format.raw/*7.15*/("""
    """),format.raw/*8.5*/("""</p>
    """)))}),format.raw/*9.6*/("""

    """),format.raw/*11.5*/("""<p>
      Username is """),_display_(/*12.20*/{request.userInfo.map(_.username).getOrElse("undefined")}),format.raw/*12.77*/("""
    """),format.raw/*13.5*/("""</p>

    """),_display_(/*15.6*/if(request.userInfo.isEmpty)/*15.34*/ {_display_(Seq[Any](format.raw/*15.36*/("""
        """),_display_(/*16.10*/helper/*16.16*/.form(routes.LoginController.login)/*16.51*/ {_display_(Seq[Any](format.raw/*16.53*/("""
            """),_display_(/*17.14*/helper/*17.20*/.CSRF.formField),format.raw/*17.35*/("""
            """),_display_(/*18.14*/helper/*18.20*/.inputText(form("username"))),format.raw/*18.48*/("""
            """),format.raw/*19.13*/("""<input type="submit"/>
        """)))}),format.raw/*20.10*/("""
    """)))}),format.raw/*21.6*/("""

    """),_display_(/*23.6*/if(request.userInfo.isDefined)/*23.36*/ {_display_(Seq[Any](format.raw/*23.38*/("""
        """),format.raw/*24.9*/("""<form action=""""),_display_(/*24.24*/routes/*24.30*/.LogoutController.logout),format.raw/*24.54*/("""" method="post">
            """),_display_(/*25.14*/helper/*25.20*/.CSRF.formField),format.raw/*25.35*/("""
            """),format.raw/*26.13*/("""<input type="submit" value="logout">
        </form>
    """)))}),format.raw/*28.6*/("""


""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(form:Form[UserInfo],request:UserRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form)(request)

  def f:((Form[UserInfo]) => (UserRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form) => (request) => apply(form)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: f0bd96dd8e2d44feacbb05aba78cf68b3f838d0c
                  MATRIX: 755->1|908->61|935->63|984->104|1023->106|1055->113|1070->120|1093->135|1146->151|1177->156|1216->169|1237->170|1266->173|1287->174|1318->179|1357->189|1390->195|1440->218|1518->275|1550->280|1587->291|1624->319|1664->321|1701->331|1716->337|1760->372|1800->374|1841->388|1856->394|1892->409|1933->423|1948->429|1997->457|2038->470|2101->502|2137->508|2170->515|2209->545|2249->547|2285->556|2327->571|2342->577|2387->601|2444->631|2459->637|2495->652|2536->665|2624->723|2658->727
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|29->5|29->5|29->5|30->6|31->7|31->7|31->7|31->7|32->8|33->9|35->11|36->12|36->12|37->13|39->15|39->15|39->15|40->16|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|44->20|45->21|47->23|47->23|47->23|48->24|48->24|48->24|48->24|49->25|49->25|49->25|50->26|52->28|55->31
                  -- GENERATED --
              */
          