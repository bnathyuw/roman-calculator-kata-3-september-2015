package implementation

object Sorter {
  private val weights = Seq('I', 'V', 'X', 'L', 'C', 'D', 'M')

  def sort = (input: String) => input sortWith romanOrder

  private def romanOrder(a: Char, b: Char) = weights.indexOf(a) > weights.indexOf(b)
}