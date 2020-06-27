package example

object Main extends App {
  println(s"1 + 1 = ${1 + 1}")
  println("Hello")
  println({
    val x = 1 + 1
    x + 1
  })
  val p = Point(1, 3)
  println(Point(1, 2))
  println(p.toString)
}

case class Point(x: Int, y: Int) {
  override def toString: String = {
    s"Point dayo $x $y"
  }
}
