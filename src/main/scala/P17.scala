object P17 {
  def split[A](n: Int, arg: List[A]): (List[A], List[A]) = {
    def inner(a: Int, remaining: List[A], accu: List[A]): (List[A], List[A]) = {
      if (a < n) {
        remaining match {
          case x :: xs => inner(a + 1, xs, accu ++ List(x))
          case _       => (accu, remaining)
        }
      } else {
        (accu, remaining)
      }
    }
    inner(0, arg, Nil)
  }

  def split2[A](n: Int, arg: List[A]): (List[A], List[A]) = {
    arg.splitAt(n)
  }
}
