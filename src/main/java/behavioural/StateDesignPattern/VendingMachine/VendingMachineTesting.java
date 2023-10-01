package behavioural.StateDesignPattern.VendingMachine;

import behavioural.StateDesignPattern.VendingMachine.Inventory.Product;
import behavioural.StateDesignPattern.VendingMachine.vendingmachine.VendingMachine;

public class VendingMachineTesting {

  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine();

    Product sandwich = new Product("Sandwich", 1, 5.0);

    for(int i = 1; i <= 3; i++) {
      vendingMachine.addProduct(sandwich);
    }

    Product toffee = new Product("Toffee", 2, 2.0);

    for(int i = 1; i <= 3; i++) {
      vendingMachine.addProduct(toffee);
    }

    vendingMachine.insertCoin(4.0);
    vendingMachine.insertCoin(3.0);
    vendingMachine.pressButton(1);

    vendingMachine.insertCoin(10.0);
    vendingMachine.pressButton(1);

    vendingMachine.insertCoin(7.0);
    vendingMachine.pressButton(2);

  }
}
