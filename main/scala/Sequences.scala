object Sequences extends App{
  val testSeq = Seq(1, 2, 3)
  print(testSeq)
  val doubledSeq = testSeq.map {
    num => num * 2
  }
  print(doubledSeq)
}
