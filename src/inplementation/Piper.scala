package inplementation

object Piper {
  def pipe(a: String, b: String => String) = b(a)
}
