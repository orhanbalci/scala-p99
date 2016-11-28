import org.scalatest.FunSuite

class P5FunSuite extends FunSuite {

	test("reverse of List(1,2,3) is List(3,2,1)"){
		assert(List(3,2,1) == P5.reverse(List(1,2,3)))
	}
}