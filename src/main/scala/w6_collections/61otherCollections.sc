/**
 * Created by thecodemaker on 1/28/14.
 */

object session {
  val xs = Array(1,2,3,4)
  xs map (x => x * 2)

  val s = "Hellow World"
  s filter (c => c.isUpper)
  s exists (c => c.isUpper)
  s forall (c => c.isUpper)
  val r: Range = 1 until 5

  1 to 5
  1 to 10 by 3

  val pairs = List(1,2,3) zip s
  pairs unzip


  def isPrim(n: Int): Boolean =
    (2 until n-1) forall (d => n % d !=0)

  isPrim(7)
  isPrim(9)

}
