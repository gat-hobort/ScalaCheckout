package scalacheckout

case class Offer[+A] (
    // default is no offer
    toPayWithOffer: (List[Product]) => Double
)
