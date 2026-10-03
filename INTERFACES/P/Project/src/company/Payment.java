package company;

public interface Payment {

    abstract void pay();

    default void receipt() {
        System.out.println("Reciept generated");

    }

    public static final int payment_Limit = 50000;
}
