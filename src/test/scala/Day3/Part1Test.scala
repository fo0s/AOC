package Day3

import Day3.Part1.{BINARY_VALUES, binaryToInt, processBinaryArray}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Part1Test extends AnyFlatSpec with should.Matchers {

  val TEST_STRING = Seq("00100", "11110", "10110", "10111", "10101", "01111", "00111", "11100", "10000", "11001", "00010", "01010")

  "Day3" should
    "have a list of binaries" in {
    assert(BINARY_VALUES.nonEmpty)
  }

  it should "process the test binary input" in {
    processBinaryArray(TEST_STRING, true) shouldBe List(1, 0, 1, 1, 0)
  }

  it should "process the binary input" in {
    processBinaryArray(BINARY_VALUES, false) shouldBe List(0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1)
  }

  it should "return a number based on test binary" in  {
    val binary = processBinaryArray(TEST_STRING, true).mkString("")

    binaryToInt(binary) shouldBe 22
  }

  it should "return a number based on binary" in {
    val binary = processBinaryArray(BINARY_VALUES, false).mkString("")
    println(binary)
    val reversedBinary = List(1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0).mkString("")

    binaryToInt(binary) shouldBe 1565
    binaryToInt(reversedBinary) shouldBe 2530
    (1565 * 2530) shouldBe 3959450
  }
}