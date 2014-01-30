/**
 * Created by thecodemaker on 1/30/14.
 */

object session {
  val romanNumerals = Map("I" ->1, "V" -> 5, "X" -> 10)


  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")


  capitalOfCountry("US")
  //capitalOfCountry("Romania")

  capitalOfCountry get "US"
  capitalOfCountry get "Romania"
  def showCapital(country: String) = capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "missing data"
  }
  showCapital("US")
  showCapital("Romania")

  val fruit = List("apple", "pear", "orange", "pineapple")
  fruit sortWith (_.length < _.length)
  fruit.sorted

  fruit groupBy (_.head)


}