/**
 * Created by thecodemaker on 1/30/14.
 */

object session {

  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")

  val cap1 = capitalOfCountry withDefaultValue "<unknown>"

  cap1("Romania")
}