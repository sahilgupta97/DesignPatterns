package behavioural.StateDesignPattern.VendingMachine.states;

public interface State {
  void onInsertCoin(double amount);
  void onPressButton(int aisleNumber);
  void dispense(int aisleNumber);
}
