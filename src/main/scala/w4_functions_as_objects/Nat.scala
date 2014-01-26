package w4_functions_as_objects

/**
 * Created by thecodemaker on 1/26/14.
 */

//Peano numbers
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

object Zero extends Nat {
  def isZero: Boolean = true
  def predecessor: Nat = throw new Error("0.precedecesor")
  def + (that: Nat): Nat = that
  def - (that: Nat): Nat = if (that.isZero) this else throw new Error("negative number")
}
class Succ(n: Nat) extends Nat {
  def isZero: Boolean = false
  def predecessor: Nat = n
  def + (that: Nat): Nat = new Succ(n + that)
  def - (that: Nat): Nat = if (that.isZero) this else n - that.predecessor
}