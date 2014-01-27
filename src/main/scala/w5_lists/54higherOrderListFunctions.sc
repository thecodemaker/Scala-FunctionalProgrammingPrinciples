/**
 * Created by thecodemaker on 1/26/14.
 */

object session {

  var nums = List(-1,-9,7,5,3,4,6,8,2)
  val fruits = List("apple", "pineapple", "orange", "banana")

  nums filter (x => x > 0)
  nums filterNot (x => x > 0)
  nums partition (x => x > 0)

  nums takeWhile (x => x > 0)
  nums dropWhile (x => x > 0)
  nums span (x => x > 0)

}