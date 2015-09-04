package inplementation

object Sorter {
  def sort = (input: String) => {
    input sortWith romanOrder
  }

  private val weights = Seq('I', 'V', 'X', 'L', 'C')

  private def romanOrder(a: Char, b: Char) = weights.indexOf(a) > weights.indexOf(b)
}
