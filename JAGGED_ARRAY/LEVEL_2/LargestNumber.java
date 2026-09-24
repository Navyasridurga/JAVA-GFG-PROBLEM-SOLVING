class LargestNumber {
    public static void main(String args[]) {
        int arr[][] = { { 10, 50 }, { 25, 80, 15 }, { 90, 40, 70, 20 } };
        int largest = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (largest < arr[i][j]) {
                    largest = arr[i][j];
                }

            }
            System.out.println(largest);
        }
    }
}