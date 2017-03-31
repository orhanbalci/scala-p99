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

  def isCoprimeTo(rhs: Int): Boolean = {
    gcd(start, rhs) == 1
  }

  def totient(): Int = {
    List.range(1, start).map(x => if (isCoprimeTo(x)) 1 else 0).sum
  }

  def primeFactors(): List[Int] = {
    def primeFactorsInner(arg: Int, primesNeeded: List[Int]): List[Int] = {
      primesNeeded.find(arg % _ == 0) match {
        case Some(a) => a :: primeFactorsInner(arg / a, primesNeeded)
        case None    => List()
      }
    }

    primeFactorsInner(start,
                      List
                        .range(2, round(ceil(sqrt(start))).asInstanceOf[Int])
                        .filter(x => new S99Int(x).isPrime)
                        .sorted)
  }
}

object S99Int {
  implicit def intTS99Int(arg: Int) = new S99Int(arg)

  def gcd(a: Int, b: Int): Int = {
    (a, b) match {
      case (x, y) if x == y => x;
      case (x, y) if x > y  => gcd(y, x - y);
      case (x, y) if y > x  => gcd(x, y - x);
    }
  }

}
