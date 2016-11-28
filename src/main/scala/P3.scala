object P3{
	def nth[A](n: Int, lst:List[A]) : A= {
		def innerDef[A](a: Int, lst:List[A]) :A = {
			if (a == n)
				lst.head
			else if(a < n)
				innerDef(a+1, lst.tail)
			else 
				throw new NoSuchElementException()
		}

		innerDef(0,lst)
	}
}