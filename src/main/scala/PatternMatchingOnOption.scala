object PatternMatchingOnOption {

  def greetings(messageOption: Option[String]): String =
    messageOption match {
      case Some(message) => message
      case None => "Message Not Found!"
    }

  def sqrtOrZero(num: Int): Double =
    FunctionsReturningOption.sqrt(num) match {
      case Some(result) => result
      case None => 0
    }

  def languageOrNoLanguage(languages: Map[Char, String], firstChar: Char): String =
    languages.get(firstChar) match {
      case Some(language) => language
      case None => s"No language starting with $firstChar"
    }

}
