/*** auxiliary constructor ***/

class math2(val num1:Int,val num2:Double) {

  var number1: Int = num1
  var number2: Double = num2
  val result: Double = addNumber()

  def addNumber(): Double = {
    number1+number2
  }

  println {
    s"primary-constructor : first-number  - $number1 and second-number - $number2"
  }

  def this(){
    /*** This will call primary constructor only */
    this(10,10.5)
    println {
      s"auxiliary-constructor1 : first-number  - $number1 and second-number - $number2"
    }
  }
  def this(a:Int){
    this(a,20.5)
    println {
      s"auxiliary-constructor2 : first-number  - $number1 and second-number - $number2"
    }
  }
  def this(b:Double){
    this(30,b)
    println {
      s"auxiliary-constructor3 : first-number  - $number1 and second-number - $number2"
    }
  }
}

object auxiliaryConstructorDemo1 {

  def main(args: Array[String]): Unit = {
    /*** This will invoke primary constructor as all parameters are passed */
    val add1 = new math2(5,7.2)

    /*** This will invoke auxiliary constructor1 as no parameters have passed */
    val add2 = new math2()

    /*** This will invoke auxiliary constructor2 as Integer value has passed */
    val add3 = new math2(20)

    /*** This will invoke auxiliary constructor3 as Double/b value has passed */
    val add4 = new math2(b = 30.5)

  }

}
