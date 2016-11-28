import org.scalatest.FunSuite

class P3FunSuite extends FunSuite {

  test("3rd of List(1,2,3,4,5) is 4") {
    assert(4 == P3.nth(3, List(1, 2, 3, 4, 5)))
  }

  test("0th of List(a,b) is a") {
    assert('a' == P3.nth(0, List('a', 'b')))
  }
}
