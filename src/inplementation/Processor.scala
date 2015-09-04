package inplementation

import inplementation.Piper.pipe

class Processor(rules: Seq[String => String] ) {
  def process(input: String): String = rules.foldLeft(input)(pipe)
}