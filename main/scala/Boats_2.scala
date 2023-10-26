object Boats extends App{
  class Boat{
    val length: Int = 100
    val width: Int= 50
    val topSpeed: Double = 300

    def isFasterThan(boatCompared: Boat): Boolean = {

      boatCompared.topSpeed > topSpeed

    }

    object JetSki extends Boat {
      override val topSpeed: Double = 250
    }
  }

  class SailBoat extends Boat {
    val numSails: Int = 15000
    val hasOars: Boolean = true
    val canTrack: Boolean = true
  }

  class MotorBoat extends Boat {
    val engineSize: String = "8m^3"
    val fuelType: String = "petrol"
  }

  class LuxurySailBoat extends SailBoat with RenownedDesigner{
    val hasJacuzzi: Boolean = true
    val hasBooze: Boolean = true
    val name="Armani"
    val location="United Kingdom"
  }

  class PirateShip extends SailBoat with Artillery{
    val numGangPlanks: String = "Scary Team"
    val numGuns= 150
    val range="750m"

    def canOutGun(boatRefferred: PirateShip): Boolean = {
      (boatRefferred.numGuns > numGuns) || (boatRefferred.range > range)
    }

  }

  class WarShip extends MotorBoat with Artillery {
    val country: String = "United Kingdom"
    val numGuns= 60000
    val range= "2km"

    def isAlly(refferedBoat: WarShip): String = {
      if (refferedBoat.country == country) "You fight together" else "Attack asap"
    }

  }

  class PacerBoat extends MotorBoat {
    val sponsor: String = "Government"
  }

  trait Artillery {
    val numGuns: Int
    val range: String
  }

  trait RenownedDesigner {
    val name: String
    val location: String
  }

  val y: PacerBoat = new PacerBoat
  println(y)

}
