object MapAndSequence extends App {

  val testSeq: Seq[String] = Seq("a", "b", "c")
  println(testSeq)
  val letter = testSeq(0)
  println(letter)

  val testMap: Map[Int, String] = Map(10 -> "dog", 11 -> "cat", 12 -> "leopard")
  print(testMap)
  val animal = testMap(10)
  print(animal)


}
