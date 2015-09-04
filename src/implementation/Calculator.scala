package implementation

object Calculator {
  val denormaliser = new Processor(Denormaliser.rules)
  var normaliser = new Processor(Normaliser.rules)

  def add(lhs: Numeral, rhs: Numeral) = {
    val s = denormaliser.process(lhs.value) + denormaliser.process(rhs.value)
    Numeral(normaliser process s)
  }
}
