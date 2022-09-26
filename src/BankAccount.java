import java.util.Scanner;

public class BankAccount {
    private double amount;

    public void deposit(double add) {
        if (add < 60000.0 && add > 0) amount = amount + add;
        else System.out.println("myndai akcha sala albaysyz");
    }

    public void withdraw(double take) {
        if (take < amount && take <= 55000) {
            amount = amount - take;
        } else {
            try {
                throw new LimitException("myncha akcha jok", amount);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getRemainingAmmount());
            }
        }
    }

    public double getAmount() {
        return amount;
    }
}
