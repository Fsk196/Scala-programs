

object MatchOperation {
  def main(args: Array[String])
  {
    val age = "20";
    age match {
      case "20" => println(age);
      case "18" => println(age);
      case "30" => println(age);
      case "40" => println(age);
      case "50" => println(age);
    }
  }
}