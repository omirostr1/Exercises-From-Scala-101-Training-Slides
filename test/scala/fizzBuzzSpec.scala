import org.scalatest.flatspec._
import fizzBuzz.fizzBuzz

class fizzBuzzSpec extends AnyFlatSpec {
  "Passing Test 5" should "return Buzz" in {
    assert(fizzBuzz(10) == "Buzz")
  }

  "Passing Test 3" should "return Fizz" in {
    assert(fizzBuzz(9) == "Fizz")
  }

  "Passing Test 3&5" should "return FizzBuzz" in {
    assert(fizzBuzz(15) == "FizzBuzz")
  }

  "Fail test" should "return Not divisible by 3 or 5" in {
    assert(fizzBuzz(7) == "Not divisible by 3 or 5")
  }

  "Dummy Test 39" should "return Fizz" in {
    assert(fizzBuzz(39) == "Fizz")
  }

  "Dummy Test 55" should "return Fizz" in {
    assert(fizzBuzz(55) == "Buzz")
  }

  "Dummy Test 22" should "return Not divisible by 3 or 5" in {
    assert(fizzBuzz(22) == "Not divisible by 3 or 5")
  }
}
