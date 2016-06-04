package github.xsistens

import scala.scalajs.js

@js.native
trait GoodFacade[T] extends js.Any {
  def test: js.Array[T] = js.native
}
