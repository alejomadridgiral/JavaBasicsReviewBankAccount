package Data;

public class BankAccount {

        public String personName;
        public double accountAmount = 0;


        public double getAccountAmount() {
                return accountAmount;
        }

        public double addMoneytoAccount(double addMoney) {
                return accountAmount + addMoney;
        }

        public double retrieveMoneytoAccount(double retrieveMoney) {
                return accountAmount - retrieveMoney;
        }
}
