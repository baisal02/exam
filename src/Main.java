import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();


        while (true) {
            buttons();
            try {
                int tap = scanner.nextInt();
                scanner.nextLine();
                if (tap == 7) {
                    break;
                }
                switch (tap) {
                    case 1:
                        bankAccount.deposit(scanner.nextDouble());
                        break;
                    case 2:
                        System.out.println(bankAccount.getAmount());
                        break;
                    case 3:
                        bankAccount.withdraw(scanner.nextDouble());
                        break;
                    default:
                        System.out.println("no such button");
                }
            } catch (InputMismatchException i) {
                System.out.println(i);
            }
        }
    }
    public static void buttons(){
        System.out.println("akcha koshuu uchun 1 basynyz");
        System.out.println("akchany koruu uchun 2 basynyz");
        System.out.println("akzha aluu ichun 3 basynyz");
    }

}