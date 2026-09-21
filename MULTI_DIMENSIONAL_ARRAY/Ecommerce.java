public class Ecommerce {
    public static void main(String[] args) {
        int [][][]ecommerce={
            {
            {10,20,30},
            {15,25,35},
            {12,22,32},
            {18,28,38}
        },
        {
            {20,30,40},
            {25,35,45},
            {22,32,42},
            {28,38,48}
        },
            
        {
            {30,40,50},
            {35,45,55},
            {32,42,52},
            {38,48,58}
    }
    };
  
   
    for(int i=0;i<3;i++){
         int sum=0;
        
        for(int j=0;j<4;j++){
            for(int k=0;k<3;k++){
            System.out.print(ecommerce[i][j][k]+" ");
             
    
            sum=sum+ecommerce[i][j][k];
           
             
            } 
            
    System.out.println();
    System.out.println("product wise:"+sum);
    
 
    }
    System.out.println("sum of each region:"+sum);
    
    System.out.println();
    
}
    
    }
}
