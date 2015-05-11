package datacreator

/**
 * Created by orotem on 10/27/2014.
 */

object runner extends App{
	override def main(args: Array[String]) {
		val dist = List(("A",1.0),("B",2.0), ("C",1.0))
		val rvg : RandomValueGenerator[String] = new RandomValueGenerator(dist) //with SerialUniformGenerator

		//val res = ((1 to 1000).map((i: Int) => rvg.getNext())).toList.groupBy(identity).mapValues(_.size)
		//println(res)
		for (i <- 1 to 10000) {
			println(rvg.getNext())
		}
		println("x")
	}
}
