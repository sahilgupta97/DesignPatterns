package structural.AdapterDesignPattern.PhonePe.bank;

import structural.AdapterDesignPattern.PhonePe.factory.BankFactory;
import structural.AdapterDesignPattern.PhonePe.constants.BankType;

public class PhonePe {
  Bank bank;

  public PhonePe() {
    // By default phone pe uses kotak bank to carry out payments
    this.bank = new KotakBank();
  }

  public PhonePe(BankType bankType) {
    this.bank = BankFactory.getPaymentBank(bankType);
  }

  public void transferMoney() {
    bank.makePayment();
    bank.checkTransactionStatus();
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }
}
