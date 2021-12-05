package Day4

import Day4.Part1.{getColumns, getRows, searchForBingo}
import Helpers.Day4Input
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Part1Test extends AnyFlatSpec with should.Matchers {

  "Day1" should
    "have a list of numbers" in {
    assert(Day4Input.TEST_INPUT.nonEmpty)
  }

  it should "extract the rows of the matrix" in {
    val test = Day4Input.TEST_INPUT(1)

    getRows(test) shouldBe List(List(22, 13, 17, 11, 0), List(8, 2, 23, 4, 24), List(21, 9, 14, 16, 7), List(6, 10, 3, 18, 5), List(1, 12, 20, 15, 19))
  }

  it should "extract the columns of the matrix" in {
    val test = Day4Input.TEST_INPUT(1)
    val rows = getRows(test)

    getColumns(rows) shouldBe List(List(22, 8, 21, 6, 1), List(13, 2, 9, 10, 12), List(17, 23, 14, 3, 20), List(11, 4, 16, 18, 15), List(0, 24, 7, 5, 19))
  }

  it should "check for bingo and tally total for test" in {
    searchForBingo(Day4Input.TEST_INPUT) shouldBe 4512
  }

  it should "hopefully get this big assed bingo game without crashing" in  {
    searchForBingo(Day4Input.DAY_4_INPUT) shouldBe 49686
  }



}
