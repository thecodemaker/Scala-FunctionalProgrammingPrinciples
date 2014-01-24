/**
 * Created by thecodemaker on 1/24/14.
 */
object session {

  class Rational(x: Int, y: Int) {
    require(y != 0, "Denominator must be non-zero.")

    val numer = x / gcd(x, y)
    val denom = y / gcd(x, y)

    def this(x: Int) =
      this(x, 1)

    def unary_- : Rational =
      new Rational(-this.numer, this.denom)

    def + (that: Rational) =
      new Rational (
        this.numer * that.denom + this.numer * that.denom,
        this.denom * that.denom
      )

    def - (that: Rational) =
      this + -that

    def < (that: Rational) =
      this.numer * that.denom < that.numer * this.denom

    def max(that: Rational) =
      if (this < (that)) that else this

    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)
    override def toString() =
      this.numer + "/" + this.denom
  }
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  y + y
  x < y
  x max y
}

