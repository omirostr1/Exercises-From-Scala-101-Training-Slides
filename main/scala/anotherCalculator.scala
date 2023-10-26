object anotherCalculator extends App{

  object Numbers {
    val x = 10
    val y = 20
    val z = 30
  }

  object Calculator {
    import Numbers._
    println(x + y)
  }

  Calculator

}
