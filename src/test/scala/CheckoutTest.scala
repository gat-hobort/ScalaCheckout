import org.scalatest._
import flatspec._
import org.scalatest.matchers.should
import scalacheckout.Inventory.{Apple, Orange}
import scalacheckout.{Checkout, Product}

class CheckoutTest extends AnyFlatSpec with should.Matchers {

  val checkout = new Checkout()

  "Checkout" should "calculate the correct amount to pay" in {

    val nonEmptyShoppingAppleOffer: List[Product] = List(new Apple(), new Apple(), new Orange(), new Apple())
    val nonEmptyShoppingOrangeOffer: List[Product] = List(new Apple(), new Orange(), new Orange(), new Orange())
    val emptyShopping: List[Product] = List()


    // 3 apples 1 orange = 2*0.6 + 0.25
    checkout.toPay(nonEmptyShoppingAppleOffer) should be (1.45)

    // 1 apple 3 oranges = 0.6 + 0.5
    checkout.toPay(nonEmptyShoppingOrangeOffer) should be (1.10)
    checkout.toPay(emptyShopping) should be (0)

  }

}


