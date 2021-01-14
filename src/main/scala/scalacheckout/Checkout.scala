package scalacheckout

import scalacheckout.ValidOffers.offerOf

class Checkout {

  def toPay(items: List[Product]): Double = {

    // grouping same items
    val g = items.groupBy(_.name)

    // apply o
    g.map(i => {
      val sameItems = i._2
      offerOf(i._1).toPayWithOffer(sameItems)
    }).foldLeft(0.0)(_ + _)
  }

}
