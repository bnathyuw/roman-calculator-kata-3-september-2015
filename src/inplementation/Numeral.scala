package inplementation

case class Numeral(value: String) {
  def +(other: Numeral) = {
    val s = Denormaliser.denormalise(this.value) + Denormaliser.denormalise(other.value)
    Numeral(Normaliser normalise s)
  }
}