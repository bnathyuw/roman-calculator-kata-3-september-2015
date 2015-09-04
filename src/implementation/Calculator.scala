package implementation

object Calculator {
  val denormaliser = new Denormaliser()
  var normaliser = new Normaliser()

  def add(lhs: Numeral, rhs: Numeral) = {
    val s = denormaliser.process(lhs.value) + denormaliser.process(rhs.value)
    Numeral(normaliser process s)
  }
}
