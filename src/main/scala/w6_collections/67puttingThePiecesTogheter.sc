import scala.io.Source

/**
 * Created by thecodemaker on 2/1/14.
 */

object session {

  val in =
   Source.fromURL(getClass.getClassLoader.getResource("w6_collections/linuxwords.txt"))
  //Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords.txt")
  val words = in.getLines().toList filter (word => word forall (chr => chr.isLetter))











  val mnem = Map(
    '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ"
  )


  //invert the mnem map to give a map from chars 'A'..'Z' to '2'..'9'
  val charCode: Map[Char, Char] =
    for((digit, str) <- mnem; ltr <- str) yield ltr -> digit



  //maps a word to the digit ex: Java -> 5282
  def wordCode(word: String): String =
    word.toUpperCase map charCode

  wordCode("Java")

  //a map from digit strings to the words that represent them
  //ex 5282 -> Java, Kata, Lava etc
  val wordsForNum: Map[String, Seq[String]] =
  words groupBy wordCode withDefaultValue Seq()

  def encode(number: String): Set[List[String]] =
    if (number.isEmpty) Set(List())
    else {
      for {
        split <- 1 to number.length
        word <- wordsForNum(number take split)
        rest <- encode(number drop split)
      } yield word :: rest
    }.toSet











  encode("7225247386")

  def translate(number: String): Set[String] =
    encode(number) map (_ mkString " ")



  translate("7225247386")
}

