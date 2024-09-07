import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        int balance=10000,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
//        while (true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXITS");
            System.out.println("Choose the operation you want to perform!");

            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Money to be Withdraw");
                    withdraw=sc.nextInt();
                    if (balance>=withdraw){
                        balance=balance-withdraw;
                        System.out.println("Please collect your money");
                    }else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter your money to be deposit");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Your money has been successfull deposit");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance: "+balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
//        }
    }
}
