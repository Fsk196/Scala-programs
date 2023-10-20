

object IfElse {
  def main(args: Array[String])
  {
    val a = 23
    val b = 45
    val c = a + b
    
    println(s"Addition of $a and $b is $c")
    
    if (a != b)
      print("Value of a is not equal to b")
    else
      println("Value of a is equal to b")
  }
  
}