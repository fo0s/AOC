package Day1

object Part1 {
  def splitIntoPairs(listOfNumbers: List[Int]) =
    listOfNumbers zip listOfNumbers.tail

  def isPairIncreasing(pairOfNumbers: (Int, Int)) =
    (pairOfNumbers._2 - pairOfNumbers._1) > 0

  def countIncreaseInPairs(listOfNumbers: List[(Int, Int)]) =
    listOfNumbers
        .map(pairs => if(isPairIncreasing(pairs)) 1 else None)
        .count(_.equals(1))

}
