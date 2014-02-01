/**
 * Created by thecodemaker on 2/1/14.
 */

object session {
  val stream = Stream(1,2,3)

  (1 to 1000).toStream
  def streamRange(lo: Int, hi: Int): Stream[Int] =
    if (lo >= hi) Stream.empty
    else Stream.cons(lo, streamRange(lo + 1, hi))

  def listRange(lo: Int, hi: Int): List[Int] =
    if (lo >= hi) Nil
    else lo :: listRange(lo + 1, hi)

  streamRange(1,10)
  listRange(1,10)

  streamRange(1, 10).take(3).toList

  def isPrime(n: Int) =
    (2 until n) forall (n % _ !=0)

  ((1000 to 10000).toStream filter isPrime)(1)


}