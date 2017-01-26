object P22 {
  def range(begin: Int, end: Int): List[Int] = {
    (begin, end) match {
      case (_, _) if begin < end  => begin :: range(begin + 1, end)
      case (_, _) if begin == end => List(begin)
      case (_, _)                 => Nil
    }
  }
}
