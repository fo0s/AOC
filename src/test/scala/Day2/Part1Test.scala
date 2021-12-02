package Day2

import Day2.Part1.{INPUT_VALUES, splitEntry, submarineNavigator}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Part1Test extends AnyFlatSpec with should.Matchers {
  "Day2" should
    "have a list of numbers" in {
    assert(INPUT_VALUES.nonEmpty)
    println(INPUT_VALUES)
  }

  it should "be able to split the entries into an array" in {
    val firstInput = INPUT_VALUES.head

    splitEntry(firstInput) shouldBe Seq("forward" , "9")
  }

  it should "work out the horizontal position based off the directions" in  {
    submarineNavigator(INPUT_VALUES) shouldBe 1882980
  }

}
