

object Demo {
  def main(args: Array[String])
  {
    val num = 10
    for (i <- 1 to(5)) {
      println("i using to " + i);
    }
    for (i <- 1 until 6) {
      println("i using until " + i);
    }
    for (i <- 1 to 9; j <- 1 to 3) {
      println("i using multiple ranges " + i+ " "+ j);
    }
    
    val lst = List(1, 2, 3, 4, 5, 6, 78, 9, 6, 5);
    for (i <-lst) {
      println("i using lst with adding 10 to the value i is " + (i+10));
    }
    
    for (i <-lst) {
      println("i using lst " + i);
    }
    for (i <- lst; if i < 6) {
      println("i using lst " + i);
    }
    
  }
}