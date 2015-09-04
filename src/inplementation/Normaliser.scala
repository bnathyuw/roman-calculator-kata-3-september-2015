package inplementation

import Sorter.sort
import Replacer.replace
import Piper.pipe

object Normaliser {
  val normalisations = Seq(
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

  def normalise(input: String): String = normalisations.foldLeft(input)(pipe)
}