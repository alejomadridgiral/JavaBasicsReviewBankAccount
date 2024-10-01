package Test;

import Data.BankAccount;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("por favor diganos cual es su nombre:");
        String getPersonName =scan.next();
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.personName = getPersonName;

        System.out.println("Usuario " + myBankAccount.personName + " el valor disponible en su cuenta es: " + myBankAccount.accountAmount);

        System.out.println("Seleccione una operación:");
        System.out.println("1: Agregar dinero a la cuenta");
        System.out.println("2: Retirar dinero de la cuenta");
        int choice = scan.nextInt();  // Read the user's choice (1 or 2).
        System.out.println("Ingrese la cantidad:");
        double amount = scan.nextDouble();  // Read the amount to add or retrieve
        myBankAccount.chooseOperation(choice, amount);

        System.out.println("Usuario " + myBankAccount.personName + " el valor disponible en su cuenta es: " + myBankAccount.accountAmount);

        }
}
