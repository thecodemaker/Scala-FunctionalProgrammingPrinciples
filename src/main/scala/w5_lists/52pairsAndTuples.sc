/**
 * Created by thecodemaker on 1/26/14.
 */

object session {

  def merge(xs: List[Int], ys: List[Int]): List[Int] =
    xs match {
      case Nil => ys
      case x :: xs1 =>
         ys match {
           case Nil => ys
           case y :: ys1 =>
             if (x < y) x :: merge (xs1, ys)
             else y :: merge(xs, ys1)
         }
    }

  def merge2(xs: List[Int], ys: List[Int]): List[Int] =
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (x < y) x :: merge2 (xs1, ys)
        else y :: merge2(xs, ys1)
    }

  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (fsd, snd) = xs splitAt n
      merge2(msort(fsd), msort(snd))
    }
  }

  var list = List(1,9,7,5,3,4,6,8,2)
  msort(list)
}