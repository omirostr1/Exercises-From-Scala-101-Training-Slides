object SequenceFiltering extends App{
  val testSeq = Seq(1, 2, 3, 4, 5)
  println(testSeq)
  val filteredSeq = testSeq.filter {
    num => num > 3
  }
  println(filteredSeq)

}
