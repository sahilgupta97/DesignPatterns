package structural.AdapterDesignPattern.PhonePe;

import structural.AdapterDesignPattern.PhonePe.bank.PhonePe;
import structural.AdapterDesignPattern.PhonePe.bank.YesBank;

public class PhonePeTesting {

  public static void main(String[] args) {
    PhonePe phonePeApp = new PhonePe();
    // By default Kotak bank is acting as underlying bank for payment
    phonePeApp.transferMoney();

    phonePeApp.setBank(new YesBank());
    phonePeApp.transferMoney();
  }

}
