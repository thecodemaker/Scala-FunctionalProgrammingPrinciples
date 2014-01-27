/**
 * Created by thecodemaker on 1/26/14.
 */

object session {

  var emptyList = List()
  var oneElementList = List(1)
  var list = List(1,2,3,4,5)
  var secondList = List(6,7,8)

  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last of empty list")
    case List(x) => x
    case y :: ys => last(ys)
  }
  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("init of empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }
  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case z :: zs => z :: concat(zs, ys)
  }

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => List()
    case y :: ys => reverse(ys) ++ List(y)
  }
  def removeAt[Any](n: Int, xs: List[Any]) =
    (xs take n) ::: (xs drop n + 1)

 // last(emptyList)
  last(oneElementList)
  last(list)
  init(oneElementList)
  init(list)
  concat(list, secondList)
  reverse(list)
  removeAt(1,list)
}
