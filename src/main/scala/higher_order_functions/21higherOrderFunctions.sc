/**
 * Created by thecodemaker on 1/24/14.
 */

object session {

  def id(x: Int): Int = x
  def cube(x: Int): Int =  x * x * x
  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int = sum(id, a, b)
  def sumCubes(a: Int, b: Int): Int = sum(cube, a, b)
  def sumFactorials(a: Int, b: Int): Int = sum(fact, a, b)
}