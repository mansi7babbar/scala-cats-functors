import cats.Functor

object FunctorSyntax {
  // Use a Functor to map over "something", applying op to each item
  def withFunctor[A, B, F[_] : Functor](item: F[A], op: A => B): F[_] = Functor[F].map(item)(op)
}
