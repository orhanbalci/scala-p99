import org.scalatest.FunSuite
import S99Int._

class P31FunSuite extends FunSuite {
  test("7 is prime") {
    assert(true == 7.isPrime)
  }

  test("10 is not prime") {
    assert(false == 10.isPrime)
  }

  test("113 is prime") {
    assert(true == 113.isPrime)
  }

  test("2 is prime") {
    assert(true == 2.isPrime)
  }

}
