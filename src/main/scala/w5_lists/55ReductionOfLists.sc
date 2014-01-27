/**
 * Created by thecodemaker on 1/27/14.
 */

object session {

  def sum(xs: List[Int]): Int = xs match {
    case Nil => 0
    case y :: ys => y + sum(ys)
  }

  def sum2(xs: List[Int]) = (0 :: xs) reduceLeft ((x,y) => x + y)

  def sum3(xs: List[Int]) = (0 :: xs) reduceLeft (_ + _)

  def sum4(xs: List[Int]) = (xs foldLeft 0) (_ + _)
  val list = List(1,2,3,4,5,6,7,8)
  sum(list)
  sum2(list)
  sum3(list)
  sum4(list)
}