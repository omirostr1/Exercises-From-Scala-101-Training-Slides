object nameLength extends App{

  def nameLength(firstName: String, surname: String): Integer = {
    if (firstName.length() > surname.length()) {
      firstName.length()
    } else if (firstName.length() < surname.length()) {
      surname.length()
    } else {
      0
    }
  }

  val test1 = nameLength(firstName = "Arnold", surname = "Schwarzenegger")
  val test2 = nameLength(firstName = "Bruce", surname = "Lee")
  val test3 = nameLength(firstName = "Ethan", surname = "Hawke")

}
