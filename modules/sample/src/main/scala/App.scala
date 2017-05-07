import scala.scalajs.js.JSApp
import scala.scalajs.js

object App extends JSApp {

  override def main(): Unit = {
    val doc = js.Dynamic.global.document
    val el = doc.getElementById("app")

    val rdm = js.Dynamic.global.ReactDOM

    println(rdm)
    println(el)
    println("yo")

  }

}
