package structural.AdapterDesignPattern.PhonePe.factory;

import structural.AdapterDesignPattern.PhonePe.constants.BankType;
import structural.AdapterDesignPattern.PhonePe.bank.Bank;
import structural.AdapterDesignPattern.PhonePe.bank.KotakBank;
import structural.AdapterDesignPattern.PhonePe.bank.YesBank;

public class BankFactory {
  public static Bank getPaymentBank(BankType bankType) {
    Bank bank = null;
    if(BankType.YES_BANK.equals(bankType)) {
      bank = new YesBank();
    } else if(BankType.KOTAK_BANK.equals(bankType)) {
      bank = new KotakBank();
    }

    return bank;
  }
}
