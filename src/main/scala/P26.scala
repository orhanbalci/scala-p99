object P26 {
  def combinations[A](n: Int, arg: List[A]): List[List[A]] = {
    n match {
      case 0 => Nil
      case 1 => arg map (List(_))
      case _ if n > 1 => {
        var result: List[List[A]] = List()
        for (i <- 0 to arg.length - n) {
          val innerArg = arg.drop(i);
          result = result ++ combinations(n - 1, innerArg.tail).map(xs => innerArg.head :: xs)
        }
        result
      }
    }
  }
}
