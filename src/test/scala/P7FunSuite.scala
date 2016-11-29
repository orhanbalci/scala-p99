import org.scalatest.FunSuite

class P7FunSuite extends FunSuite {
  test("Flat of List(List(1, 1), 2, List(3, List(5, 8))) is List(1,1,2,3,5,8)") {
    assert(
      List(1, 1, 2, 3, 5, 8) == P7.flatten(
        List(List(1, 1), 2, List(3, List(5, 8)))))
  }

  test(
    "Flat2 of List(List(1, 1), 2, List(3, List(5, 8))) is List(1,1,2,3,5,8)") {
    assert(
      List(1, 1, 2, 3, 5, 8) == P7.flatten2(
        List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}
