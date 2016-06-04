package github.xsistens

import org.scalajs.dom

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object App extends JSApp {
  @JSExport
  override def main(): Unit = {
    val testObj = new TestObject()
    dom.console.log(testObj)
    val good = testObj.asInstanceOf[GoodFacade[Item]]
    good.test.foreach(i => println(i.a))
    val bad = testObj.asInstanceOf[BadFacade[Item]]
    bad.test.foreach(i => println(i.a))
  }
}
