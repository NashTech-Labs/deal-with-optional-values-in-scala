object FunctionsReturningOption {

  // functions returning Option
  def sqrt(num: Int): Option[Double] =
    if (num >= 0) Some(Math.sqrt(num)) else None

  def checkSentence(sentence: String, word: String): Option[String] =
    if(sentence.contains(word)) Some(sentence) else None

  def languageByFirstChar(languages: Map[Char, String], firstChar: Char): Option[String] =
    languages.get(firstChar)  // get function of Map returns an option

  // extract value from Option
  def getName(nameOption: Option[String]): String =
    nameOption.getOrElse("Name Not Found!")  // getOrElse extracts the wrapped value from Option if it is present or a default value when its not present.

}
