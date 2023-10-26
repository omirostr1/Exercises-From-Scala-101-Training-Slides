object SequenceExists extends App{
  val testSeq = Seq(1, 3, 5)
  println(testSeq)
  val outcome = testSeq.exists {
    num => num > 3
  }
  println(outcome)
}
