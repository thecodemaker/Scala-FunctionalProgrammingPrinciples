/**
 * Created by thecodemaker on 2/1/14.
 */

object session {
  lazy val a = 1 + 2

  def expr = {
    val x = { print("x"); 1 }
    lazy val y = { print("y"); 2 }
    def z = { print("z"); 3 }
    z + y + x + z + y + x
  }
  expr

}