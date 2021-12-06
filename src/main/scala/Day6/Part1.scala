package Day6

import scala.collection.mutable.ListBuffer

object Part1 {

  def lanternFish(fish: List[Int], amountOfDays: Int) = {
    var listOfFish = ListBuffer.empty ++= fish

    (1 to amountOfDays).foreach {_ =>
      var addNewFish = 0

      val newFish = listOfFish.map(fish =>
        if (fish.equals(0)) {
          addNewFish += 1
          6
        } else {
          (fish - 1)
        }
      )

      if (addNewFish > 0) 1 to addNewFish foreach { _ => newFish ++= List(8) }

      listOfFish = newFish
    }

    listOfFish
  }

}
