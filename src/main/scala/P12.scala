object P12 {
  def decode(arg: List[(Int, Any)]): List[Any] = {
    arg flatMap {
      case (times, value) => List.fill(times)(value)
    }
  }
}
