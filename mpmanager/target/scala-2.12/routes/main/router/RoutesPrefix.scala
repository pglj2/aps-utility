
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Avell/Desktop/mpman/aps-utility/mpmanager/conf/routes
// @DATE:Mon Sep 25 21:13:31 GFT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
