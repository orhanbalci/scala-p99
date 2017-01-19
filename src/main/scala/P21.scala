object P21 {
  def insertAt[A](element: A, n: Int, arg: List[A]): List[A] = {
    (n, arg) match {
      case (0, Nil)     => Nil
      case (0, xs)      => element :: xs
      case (_, Nil)     => List(element)
      case (_, x :: xs) => x :: insertAt(element, n - 1, xs)
    }
  }
}
