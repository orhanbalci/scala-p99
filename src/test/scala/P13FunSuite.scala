import org.scalatest.FunSuite

class P13FunSuite extends FunSuite {
  test(
    "Encoded version of List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e) should be List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))") {
    assert(
      List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)) == P13.encodeDirect(
        List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    )
  }
}
