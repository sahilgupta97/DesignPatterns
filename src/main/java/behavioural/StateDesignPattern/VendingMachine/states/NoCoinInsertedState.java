package behavioural.StateDesignPattern.VendingMachine.states;

import behavioural.StateDesignPattern.VendingMachine.Inventory.Inventory;
import behavioural.StateDesignPattern.VendingMachine.Inventory.Product;
import behavioural.StateDesignPattern.VendingMachine.vendingmachine.VendingMachine;

public class NoCoinInsertedState implements State {

  private VendingMachine vendingMachine;

  public NoCoinInsertedState(
      VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void onInsertCoin(double amount) {
    vendingMachine.setAmount(amount);
    vendingMachine.setState(new CoinInsertedState(vendingMachine));
  }

  @Override
  public void onPressButton(int aisleNumber) {
    throw new IllegalStateException("No coin is inserted");
  }

  @Override
  public void dispense(int aisleNumber) {
    throw new IllegalStateException("No coin is inserted");
  }
}
