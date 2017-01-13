import org.scalatest.FunSuite

class P11FunSuite extends FunSuite {
  test("Encoded modified of List('a,'a,'a,'b,'c,'c) should be List((3,'a),'b,(2,'c))") {
    assert(List((3, 'a), 'b, (2, 'c)) == P11.encodeModified(List('a, 'a, 'a, 'b, 'c, 'c)))
  }
}
