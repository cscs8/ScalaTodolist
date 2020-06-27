package example

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.util.{Failure, Success}


object Main extends App {
  lazy val res = numbers.foldLeft(0)((a, b) => a + b)
  lazy val res2 = numbers.foldRight(0)((a, b) => a + b)
  val future1 = Future((1 to 100).sum)
  val future2 = Future((1000 to 100).sum)
  for {
    f1 <- future1
    f2 <- future2
  } println(s"$f1, $f2")
  future1.onComplete {
    case Success(a) => println("complete")
    case Failure(throwable) => println("Error!")
  }
  println(s"1 + 1 = ${1 + 1}")
  println("Hello")
  println({
    val x = 1 + 1
    x + 1
  })
  val p = Point(1, 3)
  println(Point(1, 2))
  println(p.toString)
  val numbers = 1 to 10
  println(s"res dayoa : $res2")
  println("hoho")
  println(res2)
}

case class Point(x: Int, y: Int) {
  override def toString: String = {
    s"Point dayo $x $y"
  }
}
