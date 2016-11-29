object P11 {
  def encodeModified(arg: List[Any]): List[Any] = {
    def encodeModifiedHelper(argInner: List[(Int, Any)]): List[Any] = {
      argInner match {
        case Nil => Nil
        case x :: xs if x._1 == 1 => x._2 :: encodeModifiedHelper(xs)
        case x :: xs if x._1 != 1 => x :: encodeModifiedHelper(xs)
      }
    }
    val encoded = P10.encode(arg)
    encodeModifiedHelper(encoded)
  }
}
