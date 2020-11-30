package weaver

private[weaver] object discard {
  def apply[T]: T => Unit = { value =>
    val _ = value
  }
}
