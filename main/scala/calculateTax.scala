object calculateTax extends App {
  def calculateTax(salary: Int):  Int = {
    if (salary > 100000) {
      (salary * 40 / 100)
    } else if ((salary > 50000) && (salary <= 100000)) {
      (salary * 20 / 100)
    } else if ((salary > 10000) && (salary <= 50000)) {
      (salary * 15 / 100)
    } else {
      (salary * 10 / 100)
    }
  }

  println(calculateTax(20000))
}
