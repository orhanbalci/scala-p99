object P23 {
  def randomSelect[A](n: Int, arg: List[A]): List[A] = {
    val nComplement = arg.length - n
    val r           = scala.util.Random

    def remover(k: Int, innerArg: List[A]): List[A] = {
      (k, arg) match {
        case (0, _)          => innerArg
        case (_, _) if k > 0 => remover(k-1,P20.removeAt(r.nextInt(innerArg.length), innerArg)._1)
        case (_, _)          => Nil
      }
    }

    remover(nComplement, arg)
  }
}
