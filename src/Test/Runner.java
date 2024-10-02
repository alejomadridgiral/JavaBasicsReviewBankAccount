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

        boolean continueTransaction = true;

        while (continueTransaction) {
            System.out.println("Seleccione una operación:");
            System.out.println("1: Agregar dinero a la cuenta");
            System.out.println("2: Retirar dinero de la cuenta");
            System.out.println("3: Salir");  // Add an option to exit the loop.

            int choice = scan.nextInt();  // Read the user's choice (1, 2, or 3).

            // Exit the loop if the user chooses option 3.
            if (choice == 3) {
                continueTransaction = false;
                System.out.println("Gracias por usar nuestros servicios. ¡Hasta luego!");
                break;
            }

            System.out.println("Ingrese la cantidad:");
            double amount = scan.nextDouble();  // Read the amount to add or retrieve
            myBankAccount.chooseOperation(choice, amount);

            System.out.println("Usuario " + myBankAccount.personName + " el valor disponible en su cuenta es: " + myBankAccount.accountAmount);
         }
        }
    }
