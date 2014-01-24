/**
 * Created by thecodemaker on 1/23/14.
 */

object exercise {
  def factorial(n: Int): Int = {
    def loop(accumulator: Int, n: Int): Int =
      if (n ==0) accumulator
        else loop(accumulator*n, n-1)
    loop(1, n)
  }

  factorial(4)
}