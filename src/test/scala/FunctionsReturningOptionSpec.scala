import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FunctionsReturningOptionSpec extends AnyFlatSpec with Matchers {

  "sqrt" should "return an Option type" in {
    val sqRootOfPositiveNum = FunctionsReturningOption.sqrt(16)
    val sqRootOfNegativeNum = FunctionsReturningOption.sqrt(-4)

    sqRootOfPositiveNum shouldEqual Some(4.0)
    sqRootOfNegativeNum shouldEqual None
  }

  "checkSentence" should "return an Option type" in {
    val sentence = "He is a good person"
    val rightWord = "good"
    val wrongWord = "bad"

    FunctionsReturningOption.checkSentence(sentence, rightWord) shouldEqual Some(sentence)
    FunctionsReturningOption.checkSentence(sentence, wrongWord) shouldEqual None
  }

  "languageByFirstChar" should "return an Option type" in {
    val languages = Map('j' -> "Java", 's' -> "Scala", 'p' -> "Python", 'r' -> "Rust")

    FunctionsReturningOption.languageByFirstChar(languages, 's') shouldEqual Some("Scala")
    FunctionsReturningOption.languageByFirstChar(languages, 'e') shouldEqual None
  }

  "getName" should "extract the value from given Option if it is present" in {
    val nameOption = Some("Prateek")
    val expectedName = "Prateek"
    val expectedString = "Name Not Found!"

    FunctionsReturningOption.getName(nameOption) shouldEqual expectedName
    FunctionsReturningOption.getName(None) shouldEqual expectedString
  }

}
