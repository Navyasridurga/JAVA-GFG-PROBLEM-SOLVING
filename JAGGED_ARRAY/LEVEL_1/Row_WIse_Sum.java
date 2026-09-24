public class Row_WIse_Sum {
    public static void main(String[] args) {
        int arr[][]={{10,20},{30,40,50},{60,70,80,90}};
        
        for(int i=0;i<3;i++){
            int sum=0;
            
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];

            }
            System.out.println(sum);

            
        }
         
        
    }
    
}
