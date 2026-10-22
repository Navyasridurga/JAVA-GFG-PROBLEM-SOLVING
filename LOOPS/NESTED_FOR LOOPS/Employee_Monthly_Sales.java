public class Employee_Monthly_Sales {
    public static void main(String[] args) {
        int[][] sales = {
                { 120, 150, 180, 130, 200, 170 },
                { 200, 190, 210, 180, 220, 250 },
                { 100, 140, 130, 160, 150, 170 },
                { 180, 175, 190, 210, 205, 195 }
        };
        for (int i = 0; i < 4; i++) {
            int monthly_Sales = 0;

            int highest = 0;
               int average;

            for (int j = 0; j < 6; j++)

            {
             

                monthly_Sales += sales[i][j];
               

                if (highest < sales[i][j]) {
                    highest = sales[i][j];
                    
                }
            }
             average = monthly_Sales / 6;

                System.out.println("Employee" + (i + 1));
                System.out.println("Total -6 Month Sales:" + monthly_Sales);
                System.out.println("Average Monthly Sales:" + average);
                System.out.println("Highest Monthy Sales:" + highest);

            }
        }
    }

