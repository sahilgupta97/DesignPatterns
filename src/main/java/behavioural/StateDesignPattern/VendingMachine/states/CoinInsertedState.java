package behavioural.StateDesignPattern.VendingMachine.states;

import behavioural.StateDesignPattern.VendingMachine.Inventory.Inventory;
import behavioural.StateDesignPattern.VendingMachine.Inventory.Product;
import behavioural.StateDesignPattern.VendingMachine.vendingmachine.VendingMachine;

public class CoinInsertedState implements State {

  private VendingMachine vendingMachine;

  public CoinInsertedState(
      VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void onInsertCoin(double amount) {
    vendingMachine.setAmount(vendingMachine.getAmount() + amount);
  }

  @Override
  public void onPressButton(int aisleNumber) {
    System.out.println("Button for aisle : " + aisleNumber + " is pressed.");
    Inventory inventory = vendingMachine.getInventory();
    Product product = inventory.getProductAt(aisleNumber);

    if(!vendingMachine.hasSufficientAmount(product.getPrice())) {
      throw new IllegalStateException("Insufficient amount to buy this product");
    }

    if(!inventory.checkIfProductAvailable(product.getProductId())) {
      throw new IllegalStateException("Product not available");
    }

    vendingMachine.setState(new DispenseState(vendingMachine));
  }

  @Override
  public void dispense(int aisleNumber) {
    throw new IllegalStateException("Product not available");
  }
}
