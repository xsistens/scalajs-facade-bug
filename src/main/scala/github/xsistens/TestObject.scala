package github.xsistens

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class TestObject extends js.Object {
  private val item1 = js.Dynamic.literal(a = "item1")
  private val item2 = js.Dynamic.literal(a = "item2")

  val test = js.Array(item1, item2)
}
