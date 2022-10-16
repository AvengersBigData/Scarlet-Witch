/*** Default Parameters in constructor (Primary constructor ) ***/

class math1(val num1:Int = 1,val num2:Double = 2.00) {

  var number1: Int = num1
  var number2: Double = num2
  val result: Double = addNumber()

  def addNumber(): Double = {
    number1+number2
  }

  println {
    s"first-number  - $number1 and second-number - $number2"
  }

}

object ConstructorDemo3 {

  def main(args: Array[String]): Unit = {
    val add1 = new math1(5,7.2)
    val add2 = new math1()
    val add3 = new math1(25)
    // val add4 = new math1(5.00) -> you need to pass parameters in correct sequence, for out of sequence see next example
    val add4 = new math1(num2=5.00) // as we specify the position by giving parameter name it will run
    // val add5 = new math1(,5.00) -> can no do this way
  }

}
