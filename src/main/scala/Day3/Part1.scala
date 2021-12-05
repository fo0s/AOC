package Day3

object Part1 {

  val BINARY_VALUES: Seq[String] = Helpers.GeneralHelpers.fileToList("src/main/scala/Helpers/Day3Input.txt")

  def processBinaryArray(listOfBinaries: Seq[String], isTestString: Boolean) = {
    val arrayToMatrix = listOfBinaries.map(_.toCharArray)
    val outputBinary = List.range(1,listOfBinaries.head.length + 1)

    outputBinary.map(column => { if(isMore1Than0(column, arrayToMatrix, isTestString)) 1 else 0})
  }

  def getCol(column: Int, input: Seq[Array[Char]]) =
    input.map{_(column - 1)}.mkString("")

  def isMore1Than0(column: Int, matrix: Seq[Array[Char]], isTestString: Boolean) =
    getCol(column, matrix)
      .replace("1", "")
      .length <= (if(isTestString) 6 else 500)

  def binaryToInt(binary: String) = Integer.parseInt(binary, 2)

}
