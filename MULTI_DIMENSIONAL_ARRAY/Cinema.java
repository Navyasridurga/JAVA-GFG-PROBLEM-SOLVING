public class Cinema {
    public static void main(String[] args) {
        int seats[][]=new int[4][5];
         seats=new int[][]{{0,1,1,0,0}
        ,{1,1,0,0,1},
        {0,0,0,1,0},
        {1,0,1,1,0}
    };
    for(int i=1;i<4;i++){
        for(int j=1;j<5;j++){
            System.out.print(seats[i][j]+" ");
        }
         System.out.println();
    }
   
    }
    
}
