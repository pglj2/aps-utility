
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Avell/Desktop/mpman/aps-utility/mpmanager/conf/routes
// @DATE:Wed Sep 27 23:12:21 GFT 2017


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
