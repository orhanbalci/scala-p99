object P16 {
  def drop[A](n: Int, arg: List[A]): List[A] = {
    arg
      .grouped(n)
      .flatMap(
        x => if (x.length == n) x.take(n - 1) else x
      )
      .to[List]
  }
}
