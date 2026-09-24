public class StudentMarks {
    public static void main(String args[]) {
        int arr[][] = { { 80, 90 }, { 70, 85, 90 }, { 95, 88, 76, 90 } };
        for (int i = 0; i < 3; i++) {
            int total = 0;
            int average = 0;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Student" + (i + 1) + ":" + arr[i][j]);
                total = total + arr[i][j];
                average = total / 4;
            }

            System.out.println("Total:" + total);
            System.out.println("Average:" + average);

        }
    }
}
