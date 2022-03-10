import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class PatternMatchingOnOptionSpec extends AnyFlatSpec with Matchers {

  "greetings" should "obtain the message from the given Option if it is present, otherwise returns an error message" in {
    val messageOption = Some("Hey! How are you")
    val expectedMessage = "Hey! How are you"
    val errorMessage = "Message Not Found!"

    PatternMatchingOnOption.greetings(messageOption) shouldEqual expectedMessage
    PatternMatchingOnOption.greetings(None) shouldEqual errorMessage
  }

  "sqrtOrZero" should "calculate square root of given number if it exists, otherwise returns zero" in {
    val posNumber = 100
    val negNumber = -16

    PatternMatchingOnOption.sqrtOrZero(posNumber) shouldEqual 10
    PatternMatchingOnOption.sqrtOrZero(negNumber) shouldEqual 0
  }

  "languageOrNoLanguage" should "find the language that starts with the given character, otherwise returns an error message" in {
    val languages = Map('j' -> "Java", 's' -> "Scala", 'p' -> "Python", 'r' -> "Rust")
    val validFirstChar = 's'
    val expectedLanguage = "Scala"
    val invalidFirstChar = 'c'
    val errorMessage = s"No language starting with $invalidFirstChar"

    PatternMatchingOnOption.languageOrNoLanguage(languages, validFirstChar) shouldEqual expectedLanguage
    PatternMatchingOnOption.languageOrNoLanguage(languages, invalidFirstChar) shouldEqual errorMessage
  }

}
