public class Total_Elements {
    public static void main(String[] args) {
        int arr[][]=new int[][]{
            new int[]{10,20},
            new int[]{30,40,50},
            new int[]{60,70,80,90}
        
        };
        int total=0;
       
        for(int i=0;i<3;i++){
          
            
            
           
            for(int j=0;j<arr[i].length;j++){
                
               total++;
                 
               
            }
             
        }
             System.out.print(total);
             
            
        }
        
          
    }
    

