package structural.AdapterDesignPattern.PhonePe.bank;

import structural.AdapterDesignPattern.PhonePe.constants.BankType;

public class KotakBank implements Bank {

  @Override
  public void makePayment() {
    System.out.println("Making payment via Kotak Bank");
  }

  @Override
  public void checkTransactionStatus() {
    System.out.println("Checking txn status done via Kotak Bank.");
  }

  @Override
  public BankType getBankType() {
    return BankType.KOTAK_BANK;
  }
}
