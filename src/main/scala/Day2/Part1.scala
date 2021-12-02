package Day2

object Part1 {

  val INPUT_VALUES: Seq[String] = Helpers.GeneralHelpers.fileToList("src/main/scala/Helpers/Day2Input.txt")

  def splitEntry(entry: String) = entry.split(" ").toSeq

  def submarineNavigator(directions: Seq[String]) = {
    var horizontal = 0
    var vertical = 0

    directions.foreach(position => {
      val readings = splitEntry(position)
      val quantity = readings.last.toInt

      readings.head match {
        case "forward" => horizontal += quantity
        case "down" => vertical += quantity
        case "up" => vertical -= quantity
      }
    })

    horizontal * vertical
  }

}
