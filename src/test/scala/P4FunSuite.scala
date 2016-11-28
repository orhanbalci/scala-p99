import org.scalatest.FunSuite

class P4FunSuite extends FunSuite {
  test("length of List(1,2,3) is 3") {
    assert(3 == P4.length(List(1, 2, 3)))
  }

  test("length of List() is 0") {
    assert(0 == P4.length(List()))
  }
}
