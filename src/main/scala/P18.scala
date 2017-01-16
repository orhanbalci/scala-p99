object P18 {
  def slice[A](begin: Int, end: Int, arg: List[A]): List[A] = {
    arg.drop(begin).take(end - begin)
  }
}
