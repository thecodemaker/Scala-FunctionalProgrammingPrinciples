import w4_functions_as_objects._

/**
 * Created by thecodemaker on 1/26/14.
 */

object exprs {

  def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Var(x) => x
    case Sum(left, right) => "(" + show(left) + " + " + show(right) + ")"
    case Prod(left, right) => "(" + show(left) + " * " + show(right) + ")"
  }
  def eval(e: Expr): Int = e match {
    case Number(x) => x
    case Sum(left, right) => eval(left) + eval(right)
    case Prod(left, right) => eval(left) * eval(right)
  }

  show(Sum(Number(2),Number(44)))
  eval(Sum(Number(2),Number(44)))
  show(Prod(Number(2),Number(44)))
  eval(Prod(Number(2),Number(44)))
  show(Sum(Prod(Number(2), Var("x")), Var("y")))
  eval(Sum(Prod(Number(2), Number(7)), Number(5)))
}