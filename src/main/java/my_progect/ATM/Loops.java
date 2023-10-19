package lessons.lesson_8.home_work.mykola_dudko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // task_1. for
        //int[] number = new int[20];
        //for (int i = 1; i <= 20; i++) {
        //    number[i - 1] = i;
        //}
        //for (int i = 0; i < 20; i++) {
        //    if (number[i] % 2 == 0) {
        //        System.out.println(number[i]);
        //    }
        //}


        // task_2. while
        //int sum = 0;
        //int number = 1;

        //while (number <= 50) {
        //    if (number % 2 != 0) {
        //        sum += number;}
        //    number++;
        //    }
        //System.out.println("Sum of odd numbers from 1 to 50: " +sum);


        // task_3. do while
        //Scanner scanner = new Scanner(System.in);
        //int sum = 0;
        //int number;

        //do {
        //    System.out.print("Enter a number (negative to complete): ");
        //    number = scanner.nextInt();

        //    if (number >= 0) {
        //        sum += number;
        //    }
        //} while (number >= 0);

        //System.out.println("Sum of positive numbers entered: " + sum);


        // task_4. for-each
        //String[] fruitts = {"apple", "pear", "watermelon", "plum", "banana", "apricot"};
        //for (String fruitt : fruitts) {
        //    System.out.println(fruitt);
        //}

        // task_4. forEach()
        //String[] fruitts = {"apple", "pear", "watermelon", "plum", "banana", "apricot"};

        //Arrays.stream(fruitts).forEach(fruit -> System.out.println(fruit));


        // task_5. nested loops
        //int rowCount = 5;

        //for (int i = 1; i <= rowCount; i++) {
        //    for (int j = 1; j <= rowCount - i; j++) {
        //        System.out.print(" ");
        //    }
        //    for (int k = 1; k <= 2 * i - 1; k++) {
        //        System.out.print("*");
        //    }
        //    System.out.println();
        //}

        // task_6. fibonacci sequence
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the number of members of the Fibonacci sequence (n): ");
        //int n = scanner.nextInt();

        //int first = 0;
        //int second = 1;

        //System.out.print("The first " + n + " members of the Fibonacci sequence: ");

        //for (int i = 1; i <= n; i++) {
        //    System.out.print(first + " ");

        //     int next = first + second;
        //     first = second;
        //    second = next;
        //}

        //System.out.println();

        // task_7. checking palindromes
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the string: ");
        //String input = scanner.nextLine();

        //String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        //boolean isPalindrome = true;

        //int length = cleanInput.length();
        //for (int i = 0; i < length / 2; i++) {
        //    if (cleanInput.charAt(i) != cleanInput.charAt(length - i - 1)) {
        //        isPalindrome = false;
        //        break;
        //    }
        //}

        //if (isPalindrome) {
        //    System.out.println("This string is a palindrome.");
        //} else {
        //    System.out.println("This string is not a palindrome.");
        //}

        // task_8. rhombus pattern
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the number of rows for the diamond: ");
        //int rowCount = scanner.nextInt();

        //for (int i = 1; i <= rowCount; i++) {
        //    for (int j = 1; j <= rowCount - i; j++) {
        //        System.out.print(" ");
        //    }
        //    for (int k = 1; k <= 2 * i - 1; k++) {
        //        System.out.print("*");
        //    }
        //    System.out.println();
        //}

        //for (int i = rowCount - 1; i >= 1; i--) {
        //    for (int j = 1; j <= rowCount - i; j++) {
        //        System.out.print(" ");
        //    }
        //    for (int k = 1; k <= 2 * i - 1; k++) {
        //        System.out.print("*");
        //    }
        //    System.out.println();
        //}

        // task_9. ATM simulator
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;
        StringBuilder transactionHistory = new StringBuilder();

        while (true) {
            System.out.println("ATM menu:");
            System.out.println("1. Check the balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Withdraw a check");
            System.out.println("5. Exit");

            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount for deposit: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    transactionHistory.append("Deposit: +").append(depositAmount).append("\n");
                    System.out.println("Money deposited successfully. New balance: " + balance);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        transactionHistory.append("Withdrawal: -").append(withdrawalAmount).append("\n");
                        System.out.println("Money withdrawn successfully. New balance: " + balance);
                    } else {
                        System.out.println("There are insufficient funds in the account.");
                    }
                    break;
                case 4:
                    System.out.println("Transaction check:");
                    System.out.println(transactionHistory.toString());
                    System.out.println("Current balance: " + balance);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);

                default:
                    System.out.println("Wrong choice. Try again.");
            }
        }
    }
}



