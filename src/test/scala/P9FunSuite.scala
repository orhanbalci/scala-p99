import org.scalatest.FunSuite

class P9FunSuite extends FunSuite {
  test(
    "Packing List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e) should yield List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))") {
    assert(
      List(List('a, 'a, 'a, 'a),
           List('b),
           List('c, 'c),
           List('a, 'a),
           List('d),
           List('e, 'e, 'e, 'e))
        == P9.pack(
          List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  }

}
