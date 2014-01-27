/**
 * Created by thecodemaker on 1/26/14.
 */

object session {

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil      => Nil
    case x :: xs1 =>
      val (first, rest) = xs span ( y => y == x)
      first :: pack(rest)
  }

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (ys => (ys.head, ys.length))

  var list = List("a", "a", "a", "b", "c", "c", "a")
  pack(list)
  encode(list)
}