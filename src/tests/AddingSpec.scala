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

  "adding V and V" should "give X" in {
    Numeral("V") + Numeral("V") should be (Numeral("X"))
  }

  "adding IV and VI" should "give X" in {
    Numeral("IV") + Numeral("VI") should be (Numeral("X"))
  }

  "adding V and IV" should "give IX" in {
    Numeral("V") + Numeral("IV") should be (Numeral("IX"))
  }

  "adding I and III" should "give IV" in {
    Numeral("I") + Numeral("III") should be (Numeral("IV"))
  }
}
