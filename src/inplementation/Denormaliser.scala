package inplementation

import inplementation.Replacer.replace

class Denormaliser extends Processor( Seq(
  replace("IV", "IIII"),
  replace("IX", "VIIII"),
  replace("XL", "XXXX"),
  replace("XC", "LXXXX"),
  replace("CD", "CCCC")
))