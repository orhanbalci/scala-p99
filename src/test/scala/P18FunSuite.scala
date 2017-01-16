import org.scalatest.FunSuite

class P18FunSuite extends FunSuite {
  test("slice 3 7 of List(1,2,3,4,5,6,7,8,9,10) shoul be List(4,5,6,7)") {
    assert(List(4, 5, 6, 7) == P18.slice(3, 7, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
  }
}
