package implementation

object Replacer {
  def replace(target: String, replacement: String) = (input: String) => {
    input replace(target, replacement)
  }
}