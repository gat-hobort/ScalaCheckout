package scalacheckout
import scalacheckout.ValidOffers._

// contains any product we sell
// including existing offers

object Inventory {


  class Apple extends Product {
    override def name: String = "apple"
    override def price: Double = 0.6

  }

  class Orange extends Product {
    override def name: String = "orange"
    override def price: Double = 0.25
  }

}
