package inplementation

case class Numeral(value: String) {
  val denormalisations = Seq(
    ("IV", "IIII"),
    ("IX", "VIIII")
  )
  val normalisations = Seq(
    ("IIIII", "V"),
    ("IIII", "IV"),
    ("VV", "X"),
    ("VIV", "IX")
  )

  def +(other: Numeral) = {
    val s = denormalise(this.value) + denormalise(other.value)
    Numeral(normalise(s))
  }

  private def denormalise(input: String): String = denormalisations.foldLeft(input)(doReplace)
  private def normalise(input: String): String = normalisations.foldLeft(input sortWith romanOrder)(doReplace)

  private def doReplace(input: String, rule: (String, String)) = {
    input replace(rule._1, rule._2)
  }

  private def romanOrder(a: Char, b: Char) = a != 'I'

}