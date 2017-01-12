object P15 {
	def duplicateN[A](n : Int, arg : List[A]) : List[A] = {
		arg.flatMap( x => List.fill(n)(x))
	}
}