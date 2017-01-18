import org.scalatest.FunSuite

class P19FunSuite extends FunSuite {
  test("Rotating 3 times List(1,2,3,4,5,6,7,8,9,10,11) should yield List(4,5,6,7,8,9,10,11,1,2,3)") {
    assert(
      List(4, 5, 6, 7, 8, 9, 10, 11, 1, 2, 3) == P19
        .rotate(3, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)))
  }
}
