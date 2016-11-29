object P8 {
  def compress[A](arg: List[A]): List[A] = {
    arg match {
      case Nil => Nil
      case x :: Nil => List(x)
      case x :: xs if x == xs.head => compress(xs)
      case x :: xs if x != xs.head => x :: compress(xs)
    }
  }
}
