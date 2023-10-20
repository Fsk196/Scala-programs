

object GreaterNum {
  def main(args: Array[String])
  {
    val a = 67
    val b = 46
    val c =23
    
    if(a >= b && a >= c)
      println(s"The Greater Num is a: $a")
    else if(b >= c)
      println(s"The Greater Num is b: $b")
    else
      print(s"The Greater Num is c: $c")
  }
}