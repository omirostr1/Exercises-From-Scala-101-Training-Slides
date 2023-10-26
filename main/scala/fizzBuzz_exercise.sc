object fizzBuzz_exercise extends App {
  def fizzBuzz(number: Int): String = {
    if ((number%3 == 0) && (number%5 == 0)){
      "FizzBuzz"
    } else if ((number%3 == 0) && (!(number%5 == 0))) {
      "Fizz"
    } else if ((!(number%3 == 0)) && (number%5 == 0)) {
      "Buzz"
    } else {
      "Not divisible by 3 or 5"
    }
  }

  println(fizzBuzz(9))

}

