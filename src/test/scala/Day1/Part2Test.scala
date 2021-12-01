package Day1


import Day1.Day1Helper.LIST_OF_NUMBERS
import Day1.Part1.countIncreaseInPairs
import Day1.Part2.splitTrioSumsIntoPairs
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Part2Test extends AnyFlatSpec with should.Matchers {
  it should "be able to split a list of numbers into sets of 3 then sum and split into pairs" in {
    val firstFiftyNumbers = LIST_OF_NUMBERS.take(50)
    val listIntoTrios = splitTrioSumsIntoPairs(firstFiftyNumbers)

    listIntoTrios.size shouldBe 47
    listIntoTrios.head shouldBe (414,423)
    listIntoTrios(1) shouldBe (423,426)
    listIntoTrios(2) shouldBe (426,426)
    listIntoTrios.last shouldBe (1021,1019)
  }

  it should "increment a counter of positive results (large)" in {
    val trioSums = splitTrioSumsIntoPairs(LIST_OF_NUMBERS)

    countIncreaseInPairs(trioSums) shouldBe 1797
  }

}
