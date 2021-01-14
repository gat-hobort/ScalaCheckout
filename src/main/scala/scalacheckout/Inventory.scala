package scalacheckout

// contains any product we sell

object Inventory {


  class Apple extends Product {
    override def price: Double = 0.6
  }

  class Orange extends Product {
    override def price: Double = 0.25
  }

}
