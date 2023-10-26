class Boat{
  val length: Integer = 100
  val width: Integer = 50
  val topSpeed: Double = 300
}

class SailBoat extends Boat {
  val numSails: Integer = 15000
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
}

class WarShip extends MotorBoat with Artillery {
  val country: String = "United Kingdom"
  val numGuns= 60000
  val range= "2km"
}

class PacerBoat extends MotorBoat {
  val sponsor: String = "Government"
}

trait Artillery {
  val numGuns: Integer
  val range: String
}

trait RenownedDesigner {
  val name: String
  val location: String
}