package Data;

public class BankAccount {

        public String personName;
        public double accountAmount = 0;

        public void addMoneytoAccount(double addMoney) {
                accountAmount += addMoney;
        }

        public void retrieveMoneytoAccount(double retrieveMoney) {
                accountAmount -= retrieveMoney;
        }
}
