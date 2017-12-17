package scala.foldings

object FoldTest {
	def main(args: Array[String]): Unit = {
		val list = List("a", "b", "c", "d")
		println(list)
		println("Initial element '', function: (a,b) => a + b")
		println(list.foldLeft("")(_ + _))
		/*
					"" + a -> a
									  a + b -> ab
									           ab + c -> abc
									                     abc + d -> abcd
		 */
		println(list.foldRight("")(_ + _))
		/*
						d + "" -> d
									c + d -> cd
											 b + cd -> bcd
											       a + bcd -> abcd
		 */

		println()
		println(list)
		println("Initial element '', function (a,b) => a.reverse + b")
		println(list.foldLeft("")(_.reverse + _))
		/*
					"".rev + a -> a
												a.rev + b -> ab
																		 ab.rev + c -> bac
																		               bac.rev + d -> cabd
		 */
		println(list.foldRight("")(_.reverse + _))
		/*
					d.rev + "" -> d
								c.rev + d -> cd
										b.rev + cd -> bcd
													a.rev + bcd -> abcd
		 */
		println()
		println(list)
		println("Initial element '', function (a,b) => a + b.reverse")
		println(list.foldLeft("")(_+_.reverse))
		/*
					"" + a.rev -> a
												a + b.rev -> ab
																		 ab + c.rev -> abc
																		               abc + d.rev -> abcd
		 */
		println(list.foldRight("")(_+_.reverse))
		/*
					d + "".rev -> d
										c + d.rev -> cd
														 b + cd.rev -> bdc
														           a + bdc.rev -> acdb
		 */
	}
}
