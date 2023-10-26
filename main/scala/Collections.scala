object Collections extends App{

  //question 1
  val names: Seq[String] = Seq("Aashvin, Omiros, Vedant")

  //question 2
  val random_words: Map[Int, String] = Map(1 -> "red", 2 -> "yellow", 3 -> "blue", 4->"refrigerator")
  val first_attempt = random_words(1)
  //val second_attempt = random_words(0) => This one prints an error as there is no key with value 0.
  val third_attempt = random_words(2)
  val fourth_attempt = random_words(3)
  val fifth_attempt = random_words(4)
  //val sixth_attempt = random_words("red") => This one prints an error as the key should be of value Int and not a String.

  println(first_attempt)
  //println(second_attempt)
  println(third_attempt)
  println(fourth_attempt)
  println(fifth_attempt)
  //println(sixth_attempt)

  //question 3
  val random_numbers: Seq[Int] = Seq(1,2,3)
  val increase_by_one = random_numbers.map {
    number => number + 1
  }

  println(increase_by_one)

  //question 4
  val randomSequence = Seq(1,2,3,4,5,6,7,8)
  val evenRemoval = randomSequence.filter {
    num => (num % 2 == 0)
  }
  println(evenRemoval)
  println(randomSequence)

  //question 5
  val anotherSequence: Seq[String] = Seq("hey", "hi", "true", "hello", "there")
  val searchForT = anotherSequence.exists {
    word => word.contains("t")
  }

  val sequenceWithoutT: Seq[String] = Seq("hey", "hi", "rude", "hello", "proud")
  val searchForTAgain = sequenceWithoutT.exists {
    word => word.contains("t")
  }

  println(searchForT)
  println(searchForTAgain)
}
