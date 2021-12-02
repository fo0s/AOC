package Day2

import Day2.Part1.INPUT_VALUES
import Day2.Part2.submarineNavigatorWithAim
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class Part2Test extends AnyFlatSpec with should.Matchers {
  it should "work out the horizontal position based off the directions" in  {
    submarineNavigatorWithAim(INPUT_VALUES) shouldBe 1971232560
  }

}
