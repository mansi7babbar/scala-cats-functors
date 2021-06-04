import cats.Functor

object EitherFunctor {
  def transformEither(either: Either[String, Int]): Either[Int, Int] = {
    Functor[Either].left.map(either)(_.size)
  }
}
