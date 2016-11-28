import org.scalatest.FunSuite

class P6FunSuite extends FunSuite{	
	test("List(1,2,3,2,1) is palindrome"){
		assert(P6.isPalindrome(List(1,2,3,2,1)))
	}
}