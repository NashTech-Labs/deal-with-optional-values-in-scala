object HigherOrderFunctionOnOption {

  // map operation on option
  def reverse(nameOption: Option[String]): Option[String] =
    nameOption.map(name => name.reverse)

  // flatMap operation on option
  def length(nameOption: Option[String]): Option[Int] =
    nameOption.flatMap(name => Some(name.length))

  // filter operation on option
  def removeNoneValues[A](list: List[Option[A]]): List[Option[A]] =
    list.filter(value => value.isDefined)
}
