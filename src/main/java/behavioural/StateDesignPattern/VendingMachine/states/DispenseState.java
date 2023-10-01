package behavioural.StateDesignPattern.VendingMachine.states;

import behavioural.StateDesignPattern.VendingMachine.Inventory.Inventory;
import behavioural.StateDesignPattern.VendingMachine.Inventory.Product;
import behavioural.StateDesignPattern.VendingMachine.vendingmachine.VendingMachine;

public class DispenseState implements State {

  private VendingMachine vendingMachine;

  public DispenseState(
      VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void onInsertCoin(double amount) {
    throw new IllegalStateException("Product getting dispensed !");
  }

  @Override
  public void onPressButton(int aisleNumber) {
    throw new IllegalStateException("Product getting dispensed !");
  }

  @Override
  public void dispense(int aisleNumber) {
    Inventory inventory = vendingMachine.getInventory();
    Product product = inventory.getProductAt(aisleNumber);

    inventory.deductProductCount(aisleNumber);
    double change = vendingMachine.getAmount() - product.getPrice();
    vendingMachine.setAmount(0);
    vendingMachine.setState(new NoCoinInsertedState(vendingMachine));

    System.out.println("Product with id : " + product.getProductId() + " getting dispensed. Please collect item and change of Rs. " + change);
  }
}
