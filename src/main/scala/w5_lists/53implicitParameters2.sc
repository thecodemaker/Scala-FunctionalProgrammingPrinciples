import math.Ordering

/**
 * Created by thecodemaker on 1/26/14.
 */

object session {

  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xs1, y :: ys1) =>
            if (ord.lt(x, y)) x :: merge (xs1, ys)
            else y :: merge(xs, ys1)
        }
      val (fsd, snd) = xs splitAt n
      merge(msort(fsd), msort(snd))
    }
  }

  var list = List(1,9,7,5,3,4,6,8,2)
  msort(list)

  val fruits = List("apple", "pineapple", "orange", "banana")
  msort(fruits)
}