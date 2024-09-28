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

    }
}
