package w4_functions_as_objects

/**
 * Created by thecodemaker on 1/25/14.
 */
trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend [U >: T](elem: U): List[U] = new Cons(elem, this)
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty: Boolean = false
}

object Nil extends List[Nothing] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

object test {
  val x: List[String] = Nil
//  def f (xs: List[NonEmpty], x: Empty) = xs prepend x
}
