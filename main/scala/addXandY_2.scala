object addXandY_2 extends App{

  object Numbers {
    val x = 10
    val y = 20
    val z = 30
  }

  object Calculator {

    import Numbers._

    def addXAndY(x: Int, y: Int) = {

      x + y
    }

    println(addXAndY(1, 2))

  }

  Calculator

}
