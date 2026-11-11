interface Recharge<T> {
    void recharge(T amount);
}

class MobileAccount {

    private long mobileNumber;
    private double balance;

    public MobileAccount(long mobileNumber, double balance) {
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        balance = balance + amount;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }
}

public class JioRecharge extends MobileAccount
        implements Recharge<Double> {

    public JioRecharge(long mobileNumber, double balance) {
        super(mobileNumber, balance);
    }

    @Override
    public void recharge(Double amount) {

        if (amount < 10) {
            throw new IllegalArgumentException(
                "Minimum recharge amount is 10"
            );
        }

        addBalance(amount);

        System.out.println("Recharge successful!");
        System.out.println("Mobile number: " + getMobileNumber());
        System.out.println("Recharge amount: " + amount);
        System.out.println("Available balance: " + getBalance());
    }
}

class Main10 {
    public static void main(String args[]) {

        JioRecharge j1 = new JioRecharge(9767234567L, 900);

        try {
            j1.recharge(90.0);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}