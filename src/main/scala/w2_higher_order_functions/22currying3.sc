/**
 * Created by thecodemaker on 1/24/14.
 */
object session {

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a+1, b))

  def product(f: Int => Int)(a: Int, b: Int) : Int =
    mapReduce(f, (x,y) => x*y, 1)(a, b)

  product(x => x)(1, 3)

  def fact(n: Int) = product(x => x)(1, n)

  fact(5)

}