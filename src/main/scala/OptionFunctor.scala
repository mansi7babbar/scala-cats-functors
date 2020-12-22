import cats.Functor

object OptionFunctor {
  def transformOption(option: Option[Int]): Option[String] = {
    Functor[Option].map(option)(_.toString)
  }
}
