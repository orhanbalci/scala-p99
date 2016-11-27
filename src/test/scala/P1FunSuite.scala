import org.scalatest.FunSuite

class P1FunSuite extends FunSuite {

  test("Calling last on List(1,2,3,4) should produce 4"){
    assert(4 == P1.last(List(1,2,3,4))) 
  }

  test("Calling last on List(3,2,1) should produce 1"){
    assert(1 == P1.last(List(3,2,1))) 
  }
}
