import org.scalatest.flatspec._
import TwoNumbers1.TwoNumbers

  class TwoNumbersSpec(x: Int, y: Int) extends AnyFlatSpec {
    "add" should "add numbers" in {
      val nums = new TwoNumbers(1, 2)
      assert(nums.add === 3)
    }
  }