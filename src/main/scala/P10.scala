object P10 {
	def encode[A](arg : List[A]) :List[(Int,A)] ={
		val packed: List[List[A]] = P9.pack(arg)
		packed map { (element : List[A]) => (element.length, element.head)}
	}
}