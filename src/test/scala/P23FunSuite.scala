import org.scalatest.FunSuite

class P23FunSuite extends FunSuite {
  test("Randomly selecting 4 items from List(1,2,3,4,5,6) should produce list of size 4") {
    assert(4 == P23.randomSelect(4, List(1, 2, 3, 4, 5, 6)).length)
  }
}
