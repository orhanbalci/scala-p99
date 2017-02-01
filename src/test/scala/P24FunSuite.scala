import org.scalatest.FunSuite
object P24FunSuite extends FunSuite{
	test("selecting 6 numbers from [0,50] should yield a list of size 6"){
		val res = P24.lotto(6, 50)
		assert( 6 == res.length)
		for(a <- res)
			assert(a < 50)
	}
}