/**
 * Created by thecodemaker on 1/24/14.
 */
object session {

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
        else f(a) + sumF(a + 1, b)
    sumF
  }

  def sumInts = sum(x => x)
  sumInts(1, 3)

  sum(x => x)(1, 3)
}