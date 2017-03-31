import org.scalatest.FunSuite
import S99Int._

class P35FunSuite extends FunSuite {
  test("prime factors of 315 is List(3,3,5,7)") {
    assert(List(3, 3, 5, 7) == 315.primeFactors)
  }
}
