class Hospital_Beds{
    public static void main(String[] args) {
        int [][]beds={
           {0,1,0,1},
            {1,0,0,1},
            {0,0,1,0}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(beds[i][j]+" ");
            }
            System.out.println();
        }
        
       
}
}