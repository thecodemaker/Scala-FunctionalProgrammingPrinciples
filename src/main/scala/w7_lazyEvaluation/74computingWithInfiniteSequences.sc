/**
 * Created by thecodemaker on 2/1/14.
 */

object session {
  def from(n: Int): Stream[Int] =
    n #:: from(n+1)

  val nats = from(0)
  val nats4s = nats map (_ * 4)

  (nats4s take 100).toList






}