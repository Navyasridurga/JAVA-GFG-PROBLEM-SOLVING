public class Food_Delivery_Zones {
    
    public static void main(String[] args) {
       
        int[][] area={{ 12,7,15,9},{20,11,6,14},{8,17,13,10}};

        for(int i=0;i<3;i++){
            int total=0;
            for(int j=0;j<4;j++){
                total=total+area[i][j];
                
                //System.out.print(area[i][j]+" ");
            }
            System.out.print(total);
            System.out.println();
        }
    
    }
}
