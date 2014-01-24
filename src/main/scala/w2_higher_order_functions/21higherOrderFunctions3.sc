/**
 * Created by thecodemaker on 1/24/14.
 */

object session {

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) 0
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }

  sum(x => x * x, 3, 5)
}