import org.scalatest._
import flatspec._
import org.scalatest.matchers.should
import scalacheckout.Inventory.{Apple, Orange}
import scalacheckout.{Checkout, Product}

class CheckoutTest extends AnyFlatSpec with should.Matchers {

  val checkout = new Checkout()

  "Checkout" should "calculate the correct amount to pay" in {

    val nonEmptyShopping: List[Product] = List(new Apple(), new Apple(), new Orange(), new Apple())
    val emptyShopping: List[Product] = List()

    checkout.toPay(nonEmptyShopping) should be (2.05)
    checkout.toPay(emptyShopping) should be (0)

  }

}


