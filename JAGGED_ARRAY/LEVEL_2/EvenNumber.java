public class EvenNumber {
    public static void main(String args[]) {
        int arr[][] = { { 10, 15 }, { 20, 25, 30 }, { 35, 40, 50 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j]);
                }
            }

        }
    }

}
