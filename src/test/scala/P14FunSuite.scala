import org.scalatest.FunSuite

class P14FunSuite extends FunSuite {
	test("duplicate of List(1,2,3) should be List(1,1,2,2,3,3)"){
		assert(List(1,1,2,2,3,3) == P14.duplicate(List(1,2,3)))
	}
}