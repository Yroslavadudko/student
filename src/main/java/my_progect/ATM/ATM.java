package lessons.lesson_8.home_work.mykola_dudko;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 2560.77;
        StringBuilder transactionHistory = new StringBuilder();

        while (true) {
            System.out.println("ATM menu:");
            System.out.println("1. Check the balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Withdraw a check");
            System.out.println("5. Exit");
            System.out.println("6. Palindrome check");

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
                    break;
                case 6:
                    System.out.println("Enter string to check for palindrome: ");
                    String inputString = scanner.next();
                    if (isPalindrome(inputString)) {
                        System.out.println("It's a palindrome.");
                    } else {
                        System.out.println("It's not a palindrome.");
                    }
                    break;
                default:
                    System.out.println("Wrong choice. Try again.");
            }
        }
    }

    private static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
