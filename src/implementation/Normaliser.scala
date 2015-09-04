package implementation

import implementation.Replacer.replace
import implementation.Sorter.sort

object Normaliser {
  val rules = Seq(
    sort,
    replace("IIIII", "V"),
    replace("IIII", "IV"),
    replace("VV", "X"),
    replace("VIV", "IX"),
    replace("XXXXX", "L"),
    replace("XXXX", "XL"),
    replace("LL", "C"),
    replace("LXL", "XC"),
    replace("CCCCC", "D"),
    replace("CCCC", "CD")
  )
}