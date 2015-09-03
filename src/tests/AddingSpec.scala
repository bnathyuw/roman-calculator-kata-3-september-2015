package tests

import inplementation.Numeral
import org.scalatest._

class AddingSpec extends FlatSpec with Matchers{
  "adding I and I" should "give II" in {
    Numeral("I") + Numeral("I") should be (Numeral("II"))
  }

  "adding II and III" should "give V" in {
    Numeral("II") + Numeral("III") should be (Numeral("V"))
  }
}
