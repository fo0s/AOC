package Day3

import Day3.Part1.{BINARY_VALUES, binaryToInt}
import Day3.Part2.filterBinaries
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Part2Test extends AnyFlatSpec with should.Matchers {

  val TEST_STRING = Seq("00100", "11110", "10110", "10111", "10101", "01111", "00111", "11100", "10000", "11001", "00010", "01010")

  it should "process the array" in {
    filterBinaries(TEST_STRING, true) shouldBe List("10111")
  }

  it should "return a number based on test binary" in  {
    val binary = filterBinaries(TEST_STRING, true).mkString("")

    binaryToInt(binary) shouldBe 23
  }

  it should "process the large array" in {
    filterBinaries(BINARY_VALUES, true) shouldBe List("011111110111")
  }

  it should "return a number based on full binary" in  {
    val binary = filterBinaries(BINARY_VALUES, true).mkString("")

    binaryToInt(binary) shouldBe 2039
  }

  it should "process the large array for C02" in {
    filterBinaries(BINARY_VALUES, false) shouldBe List("111001000001")
  }

  it should "return a number based on full binary for C02" in  {
    val binary = filterBinaries(BINARY_VALUES, false).mkString("")

    binaryToInt(binary) shouldBe 3649
  }

  it should "tally up the total" in {
    2039*3649 shouldBe 7440311
  }


}
