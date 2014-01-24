/**
 * Created by thecodemaker on 1/24/14.
 */

object session {

  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int = sum(x => x, a, b)
  def sumCubes(a: Int, b: Int): Int = sum(x => x * x * x, a, b)
  def sumFactorials(a: Int, b: Int): Int = sum(fact, a, b)
}