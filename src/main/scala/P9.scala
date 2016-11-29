object P9 {
	def pack(arg: List[Any]) : List[Any] ={		
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