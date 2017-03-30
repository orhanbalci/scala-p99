import org.scalatest.FunSuite
import S99Int._

class P33FunSuite extends FunSuite {
  test("3 is coprime to 8") {
    assert(true == 3.isCoprimeTo(8))
  }

  test("25 is not coprime to 35") {
    assert(false == 25.isCoprimeTo(35))
  }

  test("35 is coprime to 64") {
    assert(true == 35.isCoprimeTo(64))
  }
}
