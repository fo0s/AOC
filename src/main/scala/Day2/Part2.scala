package Day2

import Day2.Part1.splitEntry

object Part2 {

  def submarineNavigatorWithAim(directions: Seq[String]) = {
    var horizontal = 0
    var vertical = 0
    var aim = 0

    directions.foreach(position => {
      val readings = splitEntry(position)
      val quantity = readings.last.toInt

      readings.head match {
        case "forward" => {
          horizontal += quantity
          vertical += (aim * quantity)
        }
        case "down" => aim += quantity
        case "up" => aim -= quantity
      }
    })

    horizontal * vertical
  }

}
