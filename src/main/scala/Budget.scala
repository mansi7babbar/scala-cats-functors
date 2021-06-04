case class LineItem(price: Double)

object Budget {
  // Base method which operates on LineItems
  def calcBudget(lineItem: LineItem): LineItem = lineItem.copy(price = lineItem.price * 0.5)
}
