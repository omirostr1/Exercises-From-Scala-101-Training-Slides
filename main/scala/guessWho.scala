import guessWho.{list2d, randomNameToStart}

import scala.util.Random
import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
import scala.collection.immutable.ListMap

object guessWho extends App {

  val person1 = new Person("Marcus Rashford", "black", false, "football player", "male")
  val person2 = new Person("David Beckham", "brown", false, "football player", "male")
  val person3 = new Person("Lana Del Ray", "brown", false, "singing", "female")
  val person4 = new Person("The Weeknd", "black", true, "singing", "male")
  val person5 = new Person("Leonardo Di Caprio", "brown", false, "acting", "male")
  val person6 = new Person("Cristiano Ronaldo","black", false, "football player", "male")
  val person7 = new Person("Emma Watson", "blonde", false, "acting", "female")
  val person8 = new Person("Lionel Messi", "brown", false, "football player", "male")
  val person9 = new Person("Margot Robbie", "blonde", false, "acting", "female")
  val person10 = new Person("Ed Sheeran", "ginger", false, "singing", "male")
  val person11 = new Person("Barack Obama", "grey", false, "politics", "male")
  val person12 = new Person("Kim Kardashian", "brown", false, "influencer", "female")
  val person13 = new Person("Taylor Swift", "blonde", false, "singing", "female")
  val person14 = new Person("Beyonce", "brown", false, "singing", "female")
  val person15 = new Person("Miley Cyrus", "blonde", false, "singing", "female")
  val person16 = new Person("Will Smith", "black", false, "acting", "male")
  val person17 = new Person("Johnny Depp", "brown", false, "acting", "male")
  val person18 = new Person("Serena Williams", "brown", false, "tennis player", "female")
  val person19 = new Person("Lady Gaga", "blonde", false, "singing", "female")
  val person20 = new Person("Jennifer Aniston", "brown", false, "acting", "female")

  val list2d: List[Person] = List(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10,
    person11, person12, person13, person14, person15, person16, person17, person18, person19, person20)

  val randomNameToStart = list2d(Random.nextInt(list2d.size))
  val fullName = randomNameToStart.name


  def characterPickAndGuessing(randomNameToStart: Person, deck: List[Person]) : Unit = {
    def Categories(randomNameToStart: Person, deck: List[Person]): Unit = {
      if ((deck.size) == 1) {
        println(s"You won, the randomly character chosen was $fullName")
      } else {
        val categories: ListMap[Int, String] = ListMap(1 -> "Name", 2 -> "Hair Colour", 3 -> "Glasses", 4 -> "Occupation", 5 -> "Gender")
        val namesRemaining = deck.map(_.name).mkString(", ")
        println("Current characters left on the deck")
        println(namesRemaining)
        println(categories)
        println("Choose category")
        var categoryChoice = readInt()

        var updatedList: List[Person] = categoryChoice match {
          case 1 =>
            val choice = readLine("Enter your guess for person's full name")
            if (choice == randomNameToStart.name) {
              println("Congrats, correct choice!")
              deck.filter(person => person.name == choice)
            } else {
              println("No, wrong choice!")
              deck.filter(person => person.name != choice)
            }

          case 2 =>
            val choice = readLine("Enter your guess for hair colour")
            if (choice == randomNameToStart.hairColour) {
              println("Congrats, correct choice!")
              deck.filter(person => person.hairColour == choice)
            } else {
              println("No, wrong choice!")
              deck.filter(person => person.hairColour != choice)
            }


          case 3 =>
            val choice = readLine("Enter your guess for glasses (true or false)")
            val choiceLowerCase = choice.toLowerCase
            val choiceBool = choiceLowerCase match {
              case "true" => true
              case "false" => false
            }
            if (choiceBool == randomNameToStart.glasses) {
              println("Congrats, correct choice!")
              deck.filter(person => person.glasses == choiceBool)
            } else {
              println("No, wrong choice!")
              deck.filter(person => person.glasses != choiceBool)
            }

          case 4 =>
            val choice = readLine("Enter your guess for person's occupation (football player, acting, singing, influencer, politics, tennis player)")
            if (choice == randomNameToStart.job) {
              println("Congrats, correct choice!")
              deck.filter(person => person.job == choice)
            } else {
              println("No, wrong choice!")
              deck.filter(person => person.job != choice)
            }

          case _ =>
            val choice = readLine("Enter your guess for gender")
            if (choice == randomNameToStart.gender) {
              println("Congrats, correct choice!")
              deck.filter(person => person.gender == choice)
            } else {
              println("No, wrong choice!")
              deck.filter(person => person.gender != choice)
            }

        }
        Categories(randomNameToStart, updatedList)
      }
    }
    Categories(randomNameToStart, deck)
  }

  characterPickAndGuessing(randomNameToStart, list2d)

}