/**
If you try to compile this code, it will compile successfully as there is no syntax errors.
Bu when you try to run it, it will give error :
java.lang.NoSuchMethodException: helloWorld.main is not static

Explanation : In Scala Class main() method should be static but there is no static keyword in scala.
so better use object instead of class because in object each method is by default static.
 */


class helloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello Universe!!!")
  }
}


