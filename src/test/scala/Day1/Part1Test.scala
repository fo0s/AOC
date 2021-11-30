package Day1

import Day1.Day1Helper.LIST_OF_NUMBERS
import Day1.Part1.{countIncreaseInPairs, isPairIncreasing, splitIntoPairs}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Part1Test extends AnyFlatSpec with should.Matchers {
  "Day1" should
    "have a list of numbers" in {
      assert(LIST_OF_NUMBERS.nonEmpty)
    }

  it should "be able to split a list of numbers into pairs" in {
    val firstFiftyNumbers = LIST_OF_NUMBERS.take(50)
    val ListIntoPairs = splitIntoPairs(firstFiftyNumbers)

    ListIntoPairs.size shouldBe 49
    ListIntoPairs.head shouldBe (134,138)
    ListIntoPairs(1) shouldBe (138,142)
    ListIntoPairs(2) shouldBe (142,143)
    ListIntoPairs.last shouldBe (330,342)
  }

  it should "return a boolean if the number has increased" in {
    isPairIncreasing((1, 2)) shouldBe (true)
    isPairIncreasing((3, 1)) shouldBe (false)
  }

  it should "increment a counter of positive results (small)" in {
    val testList = List(1, 2, 3, 4, 3, 5, 6, 2, 7, 8, 9)
    countIncreaseInPairs(testList) shouldBe 8
  }

  it should "increment a counter of positive results (large)" in {
    countIncreaseInPairs(LIST_OF_NUMBERS) shouldBe 1766
  }
}
