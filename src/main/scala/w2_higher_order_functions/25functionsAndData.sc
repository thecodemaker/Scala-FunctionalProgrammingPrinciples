/**
 * Created by thecodemaker on 1/24/14.
 */
object session {

  class Rational(x: Int, y: Int) {
    def numer = x;
    def denom = y;
  }

  def addRational(r: Rational, s: Rational): Rational =
    new Rational (
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom
    )

  def makeString(r: Rational) =
    r.numer + "/" + r.denom

  makeString(addRational(new Rational(1, 2), new Rational(2,3)))
}

