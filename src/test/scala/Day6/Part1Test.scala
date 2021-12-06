package Day6

import Day6.Part1.lanternFish
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Part1Test extends AnyFlatSpec with should.Matchers {
  val DAY_6_INPUT = List(
    1,4,1,1,1,1,1,1,1,4,3,1,1,3,5,1,5,3,2,1,1,2,3,1,1,5,3,1,5,1,1,2,1,2,1,1,3,1,5,1,1,1,3,1,1,1,1,1,1,4,5,3,1,1,1,1,1,
    1,2,1,1,1,1,4,4,4,1,1,1,1,5,1,2,4,1,1,4,1,2,1,1,1,2,1,5,1,1,1,3,4,1,1,1,3,2,1,1,1,4,1,1,1,5,1,1,4,1,1,2,1,4,1,1,1,
    3,1,1,1,1,1,3,1,3,1,1,2,1,4,1,1,1,1,3,1,1,1,1,1,1,2,1,3,1,1,1,1,4,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,5,1,1,1,2,2,1,1,3,
    5,1,1,1,1,3,1,3,3,1,1,1,1,3,5,2,1,1,1,1,5,1,1,1,1,1,1,1,2,1,2,1,1,1,2,1,1,1,1,1,2,1,1,1,1,1,5,1,4,3,3,1,3,4,1,1,1,
    1,1,1,1,1,1,1,4,3,5,1,1,1,1,1,1,1,1,1,1,1,1,1,5,2,1,4,1,1,1,1,1,1,1,1,1,1,1,1,1,5,1,1,1,1,1,1,1,1,2,1,4,4,1,1,1,1,
    1,1,1,5,1,1,2,5,1,1,4,1,3,1,1)

  val TEST_FISH = List(3,4,3,1,2)
  val test_day_2 = List(1,2,1,6,0,8)
  val test_day_4 = List(6,0,6,4,5,6,7,8,8)

  "Day 6" should
    "be able to count lanterfish" in {
    assert(lanternFish(TEST_FISH, 1).nonEmpty)
  }

  it should "have the right values after 2 days" in {
    lanternFish(TEST_FISH, 2) shouldBe test_day_2
  }

  it should "have the right values after 4 days" in {
    lanternFish(TEST_FISH, 4) shouldBe test_day_4
  }

  it should "match the amount of fish as the text example after 18 days" in {
    lanternFish(TEST_FISH, 18).size shouldBe 26
  }

  it should "match the amount of fish as the text example after 80 days" in {
    lanternFish(TEST_FISH, 80).size shouldBe 5934
  }

  it should "work out the correct number of fish" in {
    lanternFish(DAY_6_INPUT, 80).size shouldBe 393019
  }

}
