import cats.Functor

object ListFunctor {
  def transformList(list: List[Int]): List[Int] = {
    Functor[List].map(list)(_ * 2)
  }
}
