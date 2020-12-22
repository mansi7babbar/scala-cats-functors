import cats.Functor

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object FutureFunctor {
  def transformFuture(future: Future[Int]): Future[Int] = {
    Functor[Future].map(future)(_ + 1)
  }
}
