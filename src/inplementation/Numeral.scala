package inplementation

case class Numeral(value: String) {
  def +(other: Numeral) = Numeral(this.value + other.value replace("IIIII", "V"))
}
