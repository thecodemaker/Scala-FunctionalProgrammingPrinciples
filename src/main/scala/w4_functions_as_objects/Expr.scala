package w4_functions_as_objects

/**
 * Created by thecodemaker on 1/26/14.
 */
trait Expr
case class Number(n: Int) extends Expr
case class Var(x: String) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr
