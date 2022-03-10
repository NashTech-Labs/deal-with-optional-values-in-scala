import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class HigherOrderFunctionOnOptionSpec extends AnyFlatSpec with Matchers{

  "reverse" should "perform map operation on given Option to find the reverse of its value" in {
    val nameOption = Some("Parul")
    val expectedResult = Some("luraP")

    HigherOrderFunctionOnOption.reverse(nameOption) shouldEqual expectedResult
    HigherOrderFunctionOnOption.reverse(None) shouldEqual None
  }

  "length" should "perform flatMap operation on given Option to find the length of its value" in {
    val nameOption = Some("Prateek")
    val expectedLength = Some(7)

    HigherOrderFunctionOnOption.length(nameOption) shouldEqual expectedLength
  }

  "removeNoneValues" should "perform filter operation on given List of Options to filter out the None values" in {
    val listOfOptions = List(Some(5), None, Some(4), Some(10), None)
    val expectedFilteredList = List(Some(5), Some(4), Some(10))

    HigherOrderFunctionOnOption.removeNoneValues(listOfOptions) shouldEqual expectedFilteredList
  }
}
