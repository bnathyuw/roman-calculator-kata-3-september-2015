package implementation

import implementation.Piper.pipe

class Processor(rules: Seq[String => String] ) {
  def process(input: String): String = rules.foldLeft(input)(pipe)
}