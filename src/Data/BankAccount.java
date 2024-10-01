package Data;

public class BankAccount {

        public String personName;
        public double accountAmount = 0;

        public void addMoneytoAccount(double amount) {
                accountAmount += amount;
        }

        public void retrieveMoneytoAccount(double amount) {
                accountAmount -= amount;
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
