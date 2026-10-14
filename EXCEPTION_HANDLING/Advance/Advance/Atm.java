public class Atm {
    public static void main(String args[]) {
        int balance = 500;
        int amount = 800;

        try {
            if (amount > balance) {
                throw new Exception("anta dabbulu levu ra");
            }
            System.out.println("withdraw successfull");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println(
                    "Transaction completed");
        }
    }
}
