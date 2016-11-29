object P9 {
	def pack[A](arg: List[A]) : List[List[A]] ={		
		arg match {
			case Nil => Nil
			case  x :: xs =>
			{
			 	val (first, second) = arg span {_ == x}
			 	first :: pack(second)
			}
		}	
	}
	
}