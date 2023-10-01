package behavioural.StateDesignPattern.VendingMachine.vendingmachine;

import behavioural.StateDesignPattern.VendingMachine.Inventory.Inventory;
import behavioural.StateDesignPattern.VendingMachine.Inventory.Product;
import behavioural.StateDesignPattern.VendingMachine.states.NoCoinInsertedState;
import behavioural.StateDesignPattern.VendingMachine.states.State;

public class VendingMachine {
  double amount;
  State state;

  Inventory inventory;
  int AISLE_COUNT = 2;

  public VendingMachine() {
    this.amount = 0;
    this.inventory = new Inventory(AISLE_COUNT);
    this.state = new NoCoinInsertedState(this);
  }

  public void insertCoin(double amount) {
    this.getState().onInsertCoin(amount);
    System.out.println(amount + " coin is inserted");
  }

  public void pressButton(int aisleNumber) {
    this.getState().onPressButton(aisleNumber);
    this.getState().dispense(aisleNumber);
  }

  public void addProduct(Product product) {
    try {
      this.getInventory().addProduct(product);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public boolean hasSufficientAmount(double expectedAmount) {
    return expectedAmount <= this.amount;
  }

  public Inventory getInventory() {
    return inventory;
  }

  public void setInventory(Inventory inventory) {
    this.inventory = inventory;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


}
