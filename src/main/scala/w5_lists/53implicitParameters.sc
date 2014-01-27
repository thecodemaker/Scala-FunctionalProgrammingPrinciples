/**
 * Created by thecodemaker on 1/26/14.
 */

object session {

  def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] =
        (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xs1, y :: ys1) =>
            if (lt(x, y)) x :: merge (xs1, ys)
            else y :: merge(xs, ys1)
        }
      val (fsd, snd) = xs splitAt n
      merge(msort(fsd)(lt), msort(snd)(lt))
    }
  }

  var list = List(1,9,7,5,3,4,6,8,2)
  msort(list)((x: Int, y: Int) => x < y)

  val fruits = List("apple", "pineapple", "orange", "banana")
  msort(fruits)((x: String, y: String) => x.compareTo(y) < 0)
}