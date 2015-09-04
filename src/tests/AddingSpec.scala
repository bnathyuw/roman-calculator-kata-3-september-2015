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

  "adding IX and V" should "give XIV" in {
    Numeral("IX") + Numeral("V") should be (Numeral("XIV"))
  }

  "adding IX and XLV" should "give LIV" in {
    Numeral("IX") + Numeral("XLV") should be (Numeral("LIV"))
  }

  "adding XXX and X" should "give XL" in {
    Numeral("XXX") + Numeral("X") should be (Numeral("XL"))
  }

  "adding LXXX and X" should "give XC" in {
    Numeral("LXXX") + Numeral("X") should be (Numeral("XC"))
  }

  "adding XC and XX" should "give CX" in {
    Numeral("XC") + Numeral("XX") should be (Numeral("CX"))
  }

  "adding CCC and C" should "give CD" in {
    Numeral("CCC") + Numeral("C") should be (Numeral("CD"))
  }

  "adding CD and CC" should "give DC" in {
    Numeral("CD") + Numeral("CC") should be (Numeral("DC"))
  }
}
