package tests

import org.scalatest._

case class Numeral(value: String) {
  def +(other: Numeral) = Numeral(this.value + other.value replace("IIIII", "V"))
}

class AddingSpec extends FlatSpec with Matchers{
  "adding I and I" should "give II" in {
    Numeral("I") + Numeral("I") should be (Numeral("II"))
  }

  "adding II and III" should "give V" in {
    Numeral("II") + Numeral("III") should be (Numeral("V"))
  }
}
