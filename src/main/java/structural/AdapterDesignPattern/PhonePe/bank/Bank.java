package structural.AdapterDesignPattern.PhonePe.bank;

import structural.AdapterDesignPattern.PhonePe.constants.BankType;

public interface Bank {
  void makePayment();
  void checkTransactionStatus();
  BankType getBankType();

}
