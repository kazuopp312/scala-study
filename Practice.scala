object Practice extends App {
  val nonTaxedPrice = 129512
  val taxedPrice = (nonTaxedPrice * 1.1).toInt
  println(taxedPrice)
}