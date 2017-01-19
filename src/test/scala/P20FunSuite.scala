import org.scalatest.FunSuite

class P20FunSuite extends FunSuite {
  test("removing 2nd element from List(1,2,3,4,5,6) should yield (List(1,2,4,5,6),3)") {
    assert((List(1, 2, 4, 5, 6), 3) == P20.removeAt(2, List(1, 2, 3, 4, 5, 6)))
  }
}
