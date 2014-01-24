/**
 * Created by thecodemaker on 1/24/14.
 */
object session {

  def sum(f: Int => Int)(a: Int, b: Int) : Int = {
    if (a > b) 0
      else f(a) + sum(f)(a + 1, b)
  }

  sum(x => x)(1, 3)
}