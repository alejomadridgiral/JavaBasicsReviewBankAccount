package Data;

public class BankAccount {

        public String personName;
        public double accountAmount = 0;

        public void addMoneytoAccount(double amount) {
                accountAmount += amount;
        }

        public void retrieveMoneytoAccount(double amount) {
                // Ensure that the account has enough money to retrieve.
                if (accountAmount >= amount) {
                        accountAmount -= amount;
                        System.out.println("Se han retirado " + amount + " de su cuenta. Saldo actual: " + accountAmount);
                } else {
                        System.out.println("Fondos insuficientes. Saldo actual: " + accountAmount);
                }
        }

        public void chooseOperation(int choice, double amount) {

                // Perform the operation based on the user's choice.
                switch (choice) {
                        case 1:
                                addMoneytoAccount(amount);
                                break;
                        case 2:
                                retrieveMoneytoAccount(amount);
                                break;
                        default:
                                System.out.println("Opción no válida.");
                                break;
                }
        }
}
