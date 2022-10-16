/*** Parameterised constructor ***/

class math(val num1:Int,val num2:Double) {

  /*** var(can change value) and val(can not change the value)*/
  /** * retrieve(GET) and change(SET) the content of number1 and number2 because it is var
   ** >> INTERNALLY SCALA CREATES 2 METHOD - GETTER AND SETTER */
  var number1: Int = num1
  var number2: Double = num2

  /*** ONLY  retrieve(GET) the content of result as it is val >> INTERNALLY SCALA CREATES ONLY 1 METHOD - GETTER */
  val result: Double = addNumber()

  def addNumber(): Double = {
    number1+number2
  }

  println {
    s"first-number  - $number1 and second-number - $number2"
  }

  println(s"result is $result")
}

object constructorDemo2 {

  def main(args: Array[String]): Unit = {
    /** * creating an object - Constructor will execute everything in class */
    val math1 = new math(5,7.2)
  }

}
