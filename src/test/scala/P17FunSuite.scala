import org.scalatest.FunSuite

class P17FunSuite extends FunSuite {
  test(
    "splitting List(1,2,3,4,5,6,7,8,9,10,11) at pos 3  should yield (List(1,2,3),List(4,5,6,7,8,9,10,11))") {
    assert(
      (List(1, 2, 3), List(4, 5, 6, 7, 8, 9, 10, 11)) == P17
        .split(3, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)))
    assert(
      (List(1, 2, 3), List(4, 5, 6, 7, 8, 9, 10, 11)) == P17
        .split2(3, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)))

  }
}
