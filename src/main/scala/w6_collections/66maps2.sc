/**
 * Created by thecodemaker on 1/30/14.
 */

object session {

  //x^3 -2*x + 5
  Map (0 -> 5, 1 -> -2, 3-> 1)

  class Poly(val terms0: Map[Int, Double]){
    def this(bindings: (Int, Double)*) =
      this(bindings.toMap)
    val terms = terms0 withDefaultValue 0.0
    def adjust (term: (Int, Double)): (Int, Double) = {
      val (exp, coeff) = term
      exp -> (coeff + terms(exp))
    }

    def + (other: Poly) =
      new Poly(terms ++ (other.terms map adjust))
    override def toString =
      (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "
  }

  val p1 = new Poly(1 -> 2.0, 3-> 4.0, 5-> 6.2)
  val p2 = new Poly(0 -> 3.0, 3-> 7.0)
  p1 + p2


}