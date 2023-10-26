import org.scalatest.flatspec._
import calculateTax.calculateTax

class calculateTaxSpec extends AnyFlatSpec {
    "below 10000" should "return 10% of the salary" in {
      assert(calculateTax(5000) == 500)
    }

    "between 10000 and 50000" should "return 15% of the salary" in {
      assert(calculateTax(20000) == 3000)
    }

    "between 50000 and 100000" should "return 20% of the salary" in {
      assert(calculateTax(60000) == 12000)
    }

    "above 100000" should "return 40% of the salary" in {
      assert(calculateTax(200000) == 80000)
    }
}
