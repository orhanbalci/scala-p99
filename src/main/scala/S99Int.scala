import scala.math._

class S99Int(val start: Int) {
  import S99Int._
  def isPrime: Boolean = {
    start match {
      case x if x < 2 => false;
      case 2          => true;
      case _          => !List.range(2, round(ceil(sqrt(start)))).exists(start % _ == 0);
    }
  }
}

object S99Int {
  implicit def intTS99Int(arg: Int) = new S99Int(arg)
}
