import org.scalatest.FunSuite

class P8FunSuite extends FunSuite {
  test(
    "Compressing List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e) should yield List('a, 'b, 'c, 'a, 'd, 'e)") {
    assert(
      List('a, 'b, 'c, 'a, 'd, 'e) == P8.compress(
        List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
