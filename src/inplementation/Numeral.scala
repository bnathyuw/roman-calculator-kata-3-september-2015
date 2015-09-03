package inplementation

case class Numeral(value: String) {
  def +(other: Numeral) = {
    val s = denormalise(this.value) + denormalise(other.value)
    Numeral(normalise(s))
  }

  private def normalise(input: String): String = {
    input.sortWith{
      case ('I', _) => false
      case _ => true
    } replace("IIIII", "V") replace("IIII", "IV") replace("VV", "X") replace ("VIV", "IX")
  }

  private def denormalise(input: String): String = {
    input replace("IV", "IIII") replace("IX", "VIIII")
  }
}
