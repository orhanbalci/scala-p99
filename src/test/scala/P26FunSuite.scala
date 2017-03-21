import org.scalatest.FunSuite

class P26FunSuite extends FunSuite {
  test("combinations of 2 of list List(1,2,3,4)") {
    val combinations = P26.combinations(2, List(1, 2, 3, 4))
    assert(combinations.exists(xs => xs == List(1, 2)))
    assert(combinations.exists(xs => xs == List(1, 3)))
    assert(combinations.exists(xs => xs == List(1, 4)))
    assert(combinations.exists(xs => xs == List(2, 3)))
    assert(combinations.exists(xs => xs == List(2, 4)))
    assert(combinations.exists(xs => xs == List(3, 4)))
  }
}
