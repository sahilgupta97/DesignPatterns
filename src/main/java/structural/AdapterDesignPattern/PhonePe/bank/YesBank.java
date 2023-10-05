package structural.AdapterDesignPattern.PhonePe.bank;

import structural.AdapterDesignPattern.PhonePe.constants.BankType;

public class YesBank implements Bank {

  // YesBank related stuff;

  @Override
  public void makePayment() {
    System.out.println("Making payment via Yes Bank.");
  }

  @Override
  public void checkTransactionStatus() {
    System.out.println("Checking txn status done via Yes Bank.");
  }

  @Override
  public BankType getBankType() {
    return BankType.YES_BANK;
  }
}
