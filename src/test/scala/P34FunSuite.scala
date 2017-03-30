import org.scalatest.FunSuite
import S99Int._

class P34FunSuite extends FunSuite {
  test("totient of 10 is 4") {
    assert(4 == 10.totient)
  }
}
