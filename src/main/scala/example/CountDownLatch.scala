package example

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Random, Success}

class CountDownLatch {
  val random = new Random()
  val range = 1000

  def run(): Unit = {

    // new 8 Future
    val f1 = newFuture()
    val f2 = newFuture()
    f1.onComplete {
      case Success(f) => println(f)
    }
    f2.onComplete {
      case Success(f) => println(f)
    }

    // TODO new 8 Future
    // TODO sleep

  }

  def newFuture(): Future[Int] = {
    Future(random.nextInt(range))
  }
}
