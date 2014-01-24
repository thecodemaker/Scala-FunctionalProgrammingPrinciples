import scala.annotation.tailrec

/**
 * Created by thecodemaker on 1/23/14.
 */

//Premature optimization is the root of all evil
object session {

  //tail recursive
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a%b)

  gcd(14, 21)

  //not tail recursive
  def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n-1)

  factorial(4)
}
