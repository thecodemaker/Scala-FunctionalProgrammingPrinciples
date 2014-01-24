/**
 * Created by thecodemaker on 1/24/14.
 */
object session {

  class Rational(x: Int, y: Int) {
    def numer = x
    def denom = y

    def neg: Rational =
      new Rational(-this.numer, this.denom)

    def add(that: Rational) =
      new Rational (
        this.numer * that.denom + this.numer * that.denom,
        this.denom * that.denom
      )

    def sub(that: Rational) =
      add(that.neg)

    override def toString() =
      this.numer + "/" + this.denom
  }

  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)
  x.sub(x).sub(z)

}

