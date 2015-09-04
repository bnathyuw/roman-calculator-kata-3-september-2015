package inplementation

case class Numeral(value: String) {
  def +(other: Numeral) = {
    Calculator.add(this, other)
  }
}