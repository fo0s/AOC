package Day1

import Day1.Part1.splitIntoPairs

object Part2 {

  def splitTrioSumsIntoPairs(listOfNumbers: List[Int]) = {
    val splitIntoTrios = listOfNumbers.sliding(3).collect{case List(a, b, c) => (a, b, c)}.toList
    val sumOfEachSet = splitIntoTrios.map(set => List(set._1, set._2, set._3).sum )

    splitIntoPairs(sumOfEachSet)
  }
}
