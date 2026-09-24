public class Print_Each_Row {
    public static void main(String[] args) {
        int arr[][]={{5,10},{15,20,25},{30,35,40,45}} ;
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
