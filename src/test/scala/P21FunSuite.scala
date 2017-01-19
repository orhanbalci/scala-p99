import org.scalatest.FunSuite

class P21FunSuite extends FunSuite {
  test("Inserting 999 in 2nd position to List(1,2,3,4,5) should yield List(1,2,999,3,4,5)") {
    assert(List(1, 2, 999, 3, 4, 5) == P21.insertAt(999, 2, List(1, 2, 3, 4, 5)))
  }
}
