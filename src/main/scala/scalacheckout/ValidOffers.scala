package scalacheckout

import scalacheckout.Inventory.{Apple, Orange}

object ValidOffers {

  val noOffer: Offer[Product] = Offer(
    toPayWithOffer = p => p.foldLeft(0.0)(_ + _.price)
  )

  def offerOf(n: String): Offer[Product] =
    n match {
      case "apple" => implicitly[Offer[Apple]]
      case "orange" => implicitly[Offer[Orange]]
      case _ =>  noOffer
    }

  implicit val appleOffer: Offer[Apple] = Offer(
    toPayWithOffer = apples => {
      val cnt = apples.size
      val price = apples.head.price
      val pairs = cnt / 2
      val mod = cnt % 2
      pairs * price  + mod * price
    }
  )

  implicit val orangeOffer: Offer[Orange] = Offer(
    toPayWithOffer = oranges => {
      val cnt = oranges.size
      val price = oranges.head.price
      val triplets = cnt / 3
      val mod = cnt % 3
      triplets * price * 2  + mod * price
    }
  )

}
