import org.scalatest.FunSuite
import S99Int._

class P36FunSuite extends FunSuite {
  test("multicity prime factors of 315 is List((3,2),(5,1),(7,1))") {
    assert(List((3, 2), (5, 1), (7, 1)) == 315.primeFactorMultiplicity)
  }
}
