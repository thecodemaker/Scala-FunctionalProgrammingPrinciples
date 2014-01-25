/**
 * Created by thecodemaker on 1/25/14.
 */

object intsets {

  abstract class IntSet {
    def incl(x: Int): IntSet
    def contains(x: Int): Boolean
    def union(other: IntSet): IntSet
  }

  class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
    def contains(x: Int): Boolean =
      if (x < elem) left contains x
      else if (x > elem) right contains x
      else true
    def incl(x: Int): IntSet =
      if (x < elem) new NonEmpty(elem, left incl x, right)
      else if (x > elem) new NonEmpty(elem, left, right incl x)
      else this
    def union(other: IntSet): IntSet =
      ((left union right) union other) incl elem

    override def toString =
      "{" + left + elem + right + "}"
  }

  class Empty extends IntSet {
    def contains(x: Int): Boolean = false
    def incl(x: Int): IntSet =
      new NonEmpty(x, new Empty, new Empty)
    override def toString = "."
    def union(other: IntSet): IntSet = other
  }

  val t1 = new NonEmpty(3, new Empty, new Empty)
  var t2 = t1 incl 4
  var t3 = t1 union t2
}