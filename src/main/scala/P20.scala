object P20 {
  def removeAt[A](n: Int, arg: List[A]): (List[A], A) = {
    (arg.take(n) ::: arg.drop(n + 1), arg(n))
  }
}
