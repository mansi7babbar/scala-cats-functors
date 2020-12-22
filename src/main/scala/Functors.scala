import cats.Functor

case class LineItem(price: Double)

object Functors {

  def calcBudget[F[_]](order: F[LineItem])(implicit ev: Functor[F]): F[LineItem] = {
    Functor[F].map(order)(o => o.copy(price = o.price * 0.5))
  }

  def withFunctor[A, B, F[_]](item: F[A], op: A => B)(implicit ev: Functor[F]): F[_] = Functor[F].map(item)(op)
}
