object P5 {
	def reverse[A](arg:List[A]) : List[A] = {
		arg match {
			case Nil => Nil
			case x :: xs => reverse(xs) :+ x 
		}
	}
}