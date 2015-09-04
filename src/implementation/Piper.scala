package implementation

object Piper {
  def pipe(a: String, b: String => String) = b(a)
}