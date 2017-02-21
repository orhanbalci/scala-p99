import org.scalatest.FunSuite

class P12FunSuite extends FunSuite {
  test(
    "Decoded version of List((4,'a),(1,'b),(2,'c),(2,'a), (1,'d), (4,'e)) should be List('a,'a,'a,'a,'b,'c,'c,'a,'a,'d,'e,'e,'e,'e)") {
    assert(
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e,
        'e) == P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    )
  }
}
