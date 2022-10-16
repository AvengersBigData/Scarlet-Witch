/** access level in scala :
      *  public - can access anywhere ( by default no need to specify explicitly )
      *  private - can access only in the class it is defined,
      *  protected - can access in class it is defined as well as in subclass extending the given class using inheritance
 */

class car {
  var carName = "Nexon"
  private var carBaseCost = 1000
  private var carTax = 30
  protected var carCompany = "Tata Motors"

  def totalCarCost(basicCost: Int): Int = basicCost + carBaseCost + carTax

  def getTaxValue: Int = {
    carTax = 100 /*** Unintentional, Done by mistake. It will change of carTax value everywhere in class */
    carTax
  }
}

object demoClassObject {

  def main(args: Array[String]): Unit = {
    var nexon = new car
    println(nexon.carName)
    nexon.carName = "Nexon EV"
    println(nexon.carName)

    print("Tax is : "+nexon.getTaxValue)

  }

}
