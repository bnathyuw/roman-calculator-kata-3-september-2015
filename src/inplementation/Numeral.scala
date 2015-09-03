package inplementation

case class Numeral(value: String) {
  val denormalisations = Seq(
    replace("IV", "IIII"),
    replace("IX", "VIIII")
  )
  
  val normalisations = Seq(
    sort,
    replace("IIIII", "V"),
    replace("IIII", "IV"),
    replace("VV", "X"),
    replace("VIV", "IX")
  )

  def +(other: Numeral) = {
    val s = denormalise(this.value) + denormalise(other.value)
    Numeral(normalise(s))
  }

  private def denormalise(input: String): String = denormalisations.foldLeft(input)(bar)

  private def normalise(input: String): String = normalisations.foldLeft(input)(bar)

  def bar(a: String, b: String => String) = b(a)

  private def replace(target: String, replacement: String) = (input: String) => {
    input replace(target, replacement)
  }

  private def sort = (input: String) => {
    input sortWith romanOrder
  }

  private def romanOrder(a: Char, b: Char) = a != 'I'
}