package Day4

object Part1 {
  def searchForBingo(inputValues: List[List[Int]]) = {
    val bingoNumbers = inputValues.head
    val bingoMatrix = inputValues.slice(1, inputValues.size)
    var winningMatrix = List(List(0))
    var count = 0

    val processedMatrix = bingoMatrix.map(matrix => {
      val matrixRows = getRows(matrix)
      matrixRows ++ getColumns(matrixRows)
    })

    while(winningMatrix.head.head.equals(0)) {

      for((v, i) <- processedMatrix.zipWithIndex) {
        val currentLiveNumbers = bingoNumbers.slice(0, (5 + count))

        v.foreach(numbers => {
          val allNumbers = numbers ++ currentLiveNumbers
          val hasAllNumbers = allNumbers.distinct.size.equals(allNumbers.size - 5)

          if (hasAllNumbers) winningMatrix = List(List(processedMatrix.indexOf(v, i)), numbers, currentLiveNumbers)
        })
      }

      count += 1
    }

    tallyTotal(bingoMatrix(winningMatrix.head.head), winningMatrix(2))
  }

  def getColumns(matrix: List[List[Int]]) =
    List.range(0,5).map(column => matrix.map{_(column)})

  def getRows(matrix: List[Int]) =
    List.range(0,5).map(row => matrix.slice((row * 5), (row * 5) + 5))

  def tallyTotal(bingoMatrix: List[Int], bingoList: List[Int]) =
    bingoMatrix.filterNot { bingoList.contains(_) }.sum * bingoList.last

}
