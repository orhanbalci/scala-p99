import org.scalatest.FunSuite

class P22FunSuite extends FunSuite {
  test("range(4,9) should yield List(4,5,6,7,8,9)") {
    assert(List(4, 5, 6, 7, 8, 9) == P22.range(4, 9))
  }
}
