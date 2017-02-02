object P25 {
  def randomPermute[A](arg: List[A]): List[A] = {
    P23.randomSelect(arg.length, arg)
  }
}
