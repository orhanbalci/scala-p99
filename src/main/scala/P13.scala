object P13 {
  def encodeDirect[A](arg: List[A]): List[(Int, A)] = {
    arg match {
      case Nil => Nil
      case x :: xs => {
        val (first, second) = arg span { _ == x }
        (first.size, first(0)) :: encodeDirect(second)
      }
    }
  }
}
