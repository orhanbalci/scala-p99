object P2 {
  def penultimate[A](input: List[A]): A = {
    input match {
      case x :: (y :: Nil) => x
      case x :: xs => penultimate(xs)
      case _ => throw new NoSuchElementException
    }
  }
}
