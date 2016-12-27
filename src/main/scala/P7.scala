object P7 {
  def flatten(arg: List[_]): List[_] = {
    arg match {
      case Nil                => Nil
      case (x: List[_]) :: xs => flatten(x) ++ flatten(xs)
      case x :: xs            => List(x) ++ flatten(xs)
    }
  }

  def flatten2(arg: List[Any]): List[Any] = {
    arg flatMap {
      case e: List[_] => flatten2(e)
      case e          => List(e)
    }
  }

}
