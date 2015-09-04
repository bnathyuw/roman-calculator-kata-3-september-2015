package implementation

import implementation.Replacer.replace

object Denormaliser {
  val rules = Seq(
    replace("IV", "IIII"),
    replace("IX", "VIIII"),
    replace("XL", "XXXX"),
    replace("XC", "LXXXX"),
    replace("CD", "CCCC"),
    replace("CM", "DCCCC")
  )
}