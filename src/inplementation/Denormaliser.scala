package inplementation

import Replacer.replace
import Piper.pipe

object Denormaliser {
  val denormalisations = Seq(
    replace("IV", "IIII"),
    replace("IX", "VIIII"),
    replace("XL", "XXXX"),
    replace("XC", "LXXXX"),
    replace("CD", "CCCC")
  )

  def denormalise(input: String): String = denormalisations.foldLeft(input)(pipe)
}