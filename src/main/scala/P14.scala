object P14 {
  def duplicate[A](arg: List[A]): List[A] = {
    arg.flatMap(x => x :: List(x))
  }
}
