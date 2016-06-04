package github.xsistens

import scala.scalajs.js

@js.native
trait BadFacade[+T] extends js.Any {
  def test[T2 >: T]: js.Array[T2] = js.native
}
