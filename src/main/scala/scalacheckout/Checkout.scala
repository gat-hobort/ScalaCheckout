package scalacheckout

class Checkout {

  def toPay(items: List[Product]): Double =
    items.foldLeft(0.0)(_ + _.price)

}
