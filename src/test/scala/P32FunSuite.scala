import org.scalatest.FunSuite
import S99Int._

class P32FunSuite extends FunSuite {
  test("gcd of 15 and 5 is 5") {
    assert(5 == gcd(10, 5))
  }

  test("gcd of 252 and 105 is 21") {
    assert(21 == gcd(105, 252))
  }
}
