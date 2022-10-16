
class person {
  val firstName = "Pratik"
  val lastName = "Thakare"

  def getFullName: String = {
    firstName + lastName
  }

  println {
    s"first-Name  - $firstName and last-name - $lastName"
  }
  val z: String = getFullName
  println(s"full-name is $z")
}

object constructorDemo1 {

  def main(args: Array[String]): Unit = {
    /** * creating an object - Constructor will execute everything in class */
    val person1 = new person
  }

}
