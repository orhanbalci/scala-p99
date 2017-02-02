import org.scalatest.FunSuite

class P25FunSuite extends FunSuite {
  test(
    "random permutation of a list of size 5 should yield a list of size 5 including same elements") {
    val permuted = P25.randomPermute(List(1, 2, 3, 4, 5))
    assert(5 == permuted.length)
    assert(permuted forall (x => List(1, 2, 3, 4, 5) contains x))
  }
}
