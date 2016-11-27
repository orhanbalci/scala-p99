object P1 {
  def last[A](input: List[A]): A = {
    input match {
      case x :: Nil => x
      case x :: xs => last(xs)
    }
  }
}
