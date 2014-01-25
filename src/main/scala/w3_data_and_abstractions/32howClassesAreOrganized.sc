import w3_data_and_abstractions.Rational
/**
 * Created by thecodemaker on 1/25/14.
 */
object Session {
  new Rational(1, 2)
  def error(msg: String) =
    throw new Error(msg)
  error("test")

  val x = null
  val y: String = x

}
