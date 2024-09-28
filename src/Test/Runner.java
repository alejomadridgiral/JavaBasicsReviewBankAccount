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

        System.out.println("El valor disponible en su cuenta es: " + myBankAccount.accountAmount);

        System.out.println("por favor agregue el valor que desea sumar a su cuenta:");
        double receiveAmountToAdd = scan.nextFloat();
        myBankAccount.addMoneytoAccount(receiveAmountToAdd);

        System.out.println("El valor disponible en su cuenta es: " + myBankAccount.accountAmount);

        System.out.println("por favor agregue el valor que desea sacar de su cuenta:");
        double receiveAmountToRetrieve = scan.nextFloat();
        myBankAccount.retrieveMoneytoAccount(receiveAmountToRetrieve);

        System.out.println("Usuario(a); " + myBankAccount.personName);
        System.out.println("El valor disponible en su cuenta es " + myBankAccount.accountAmount);
    }
}
