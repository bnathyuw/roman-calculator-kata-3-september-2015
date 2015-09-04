package inplementation

object Sorter {
  private val weights = Seq('I', 'V', 'X', 'L', 'C')

  def sort = (input: String) => input sortWith romanOrder

  private def romanOrder(a: Char, b: Char) = weights.indexOf(a) > weights.indexOf(b)
}