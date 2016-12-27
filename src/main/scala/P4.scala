object P4 {
  def length[A](input: List[A]): Int = {
    input match {
      case Nil     => 0
      case x :: xs => 1 + length(xs)
    }
  }
}
