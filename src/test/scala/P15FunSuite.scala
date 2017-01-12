import org.scalatest.FunSuite

class P15FunSuite extends FunSuite {
	test("duplicate 3 of List(1,2,3) is List(1,1,1,2,2,2,3,3,3)"){
		assert(List(1,1,1,2,2,2,3,3,3) == P15.duplicateN(3, List(1,2,3)))
	}
}