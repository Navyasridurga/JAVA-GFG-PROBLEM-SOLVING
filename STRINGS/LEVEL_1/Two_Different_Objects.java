public class Two_Different_Objects {
    public static void main(String args[]) {
        String employee1 = new String("Navya");
        String employee2 = new String("Navya");
        if (employee1.equals(employee2)) {
            System.out.println("avunu");

        } else {
            System.out.println("ledu");
        }
        if (employee1 == employee2) {
            System.out.println("mirchi");

        } else {
            System.out.println("paradise");
        }
    }

}