object functions {

  def main(args: Array[String]): Unit = {
    var result = add(2,5)
    var result1 = add1(2,5)
    println(result)
    println(result1)
  }

//  If you add return statement then specify return type is must
  def add(x:Int,y:Int):Int ={
    return x+y // return keyword is optional
  }

//  It is taking return type automatically if you don't specify return keyword
  def add1(a:Int,b:Int): Int ={
    a+b
  }

/** you don't need to write the parenthesis as well (Optional) if the function is of single line **/
  def add2(x:Int,y:Int): Int = x+y

}
