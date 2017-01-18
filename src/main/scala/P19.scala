object P19 {
  def rotate[A](n: Int, arg: List[A]): List[A] = {
    (n, arg) match {
      case (0, xs)      => xs
      case (a, x :: xs) => rotate(a - 1, xs ++ List(x))
      case (a, Nil)     => Nil
    }
  }
}
