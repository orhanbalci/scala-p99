import org.scalatest.FunSuite

class P2FunSuite extends FunSuite {
  test("The element before last for List(1,2,3) is 2") {
    assert(2 == P2.penultimate(List(1, 2, 3)))
  }

  test("The element before last for List(Istanbu, Ankara, Izmir) is Ankara") {
    assert("Ankara" == P2.penultimate(List("Istanbul", "Ankara", "Izmir")))
  }
}
