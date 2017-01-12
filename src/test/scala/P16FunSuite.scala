import org.scalatest.FunSuite

class P16FunSuite extends FunSuite {
	test("dropping every 3 element of List(1,2,3,4,5,6,7) should yield List(1,2,4,5,7)"){
		assert(List(1,2,4,5,7) == P16.drop(3, List(1,2,3,4,5,6,7)))		
	}
}