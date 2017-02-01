object P24 {
	def lotto(n : Int, m : Int) : List[Int] = {
		val r = scala.util.Random
		(n,m) match  {
			case(0, _) => List(r.nextInt(m))
			case(a, _) if a > 0 => r.nextInt(m) :: lotto(a-1,m)
		} 
	}
}