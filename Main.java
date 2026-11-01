import java.util.InputMismatchException;
import java.util.Scanner;

class Bank {
    private double balance; // Account balance

    // Withdraw function
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Has been withdrawn " + amount + " From the account. Current balance: " + balance);
        } else {
            System.out.println("The specified amount cannot be withdrawn");
        }
    }

    // Deposit function
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Has been deposited " + amount + " in the account. Current balance: " + balance);
        } else {
            System.out.println("The specified amount cannot be deposited");
        }
    }

    // Balance query function
    double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank account = new Bank();
        int choice;
        double amount;
        int password = 4444;
        int number;

        System.out.println("********** (( Welcome )) **********\n");

//        while (true) {
            try{
               System.out.print("Please Enter The Password: ");
            number = scanner.nextInt();

            if (number == password) {
                while (true) {
                    System.out.println();
                    System.out.println("----*----*----*(( Select the desired operation ))*----*----*----\n");
                    System.out.println("\t( 1 ) Withdraw from the account");
                    System.out.println("\t( 2 ) Deposit into the account");
                    System.out.println("\t( 3 ) Balance check");
                    System.out.println("\t( 4 ) Finish");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Please enter the amount to be withdrawn: ");
                            amount = scanner.nextDouble();
                            account.withdraw(amount);
                            break;
                        case 2:
                            System.out.print("Please enter the amount to be deposited: ");
                            amount = scanner.nextDouble();
                            account.deposit(amount);
                            break;
                        case 3:
                            System.out.println("The current balance is: " + account.getBalance());
                            break;
                        case 4:
                            System.out.println("******(( Exited the program ))******");
                            return;
                        default:
                            System.out.println("Invalid selection, please try again");
                            break;
                    }
                }
            } else {
                System.out.println("\nSorry, the password is wrong. Try again.\n");
            } 
            }
            catch(InputMismatchException e){
                System.out.println("Erorr, Enter The Number NOT Char");
            }
            
//        }
    }
}

// Eng.Abdulaleem Alsofi
