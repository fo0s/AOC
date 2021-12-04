package Day3

import Day3.Part1.getCol

import scala.collection.mutable.ListBuffer

object Part2 {

  def filterBinaries(listOfBinaries: Seq[String], isOxygen: Boolean) = {
    var binaryList = ListBuffer.empty ++= listOfBinaries
    var count = 0

    while (binaryList.size > 1) {
      var arrayToMatrix = binaryList.map(_.toCharArray)
      var toFilter = getFilterNumber(count+1, arrayToMatrix.toList, binaryList.size, isOxygen)

      binaryList = binaryList.filter(test => test.charAt(count).equals(toFilter.toString.charAt(0)))

      count += 1
    }

    binaryList
  }

  def getFilterNumber(column: Int, matrix: Seq[Array[Char]], listSize: Int, isOxygen: Boolean) = {
    var isOne = getCol(column, matrix)
      .replace("1", "")
      .length

    (isOne <= (listSize/2), isOxygen) match {
      case (true, true) | (false, false) => 1
      case (false, true) | (true, false) => 0
     }
  }

}
