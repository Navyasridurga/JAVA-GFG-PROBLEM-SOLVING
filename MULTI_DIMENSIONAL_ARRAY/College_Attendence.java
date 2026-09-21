public class College_Attendence {
    public static void main(String[] args) {
        int attendence[][]={{1,1,0,1,1,0},{1,0,1,1,0,1},{0,1,1,0,1,0},{1,1,0,1,0,1},{0,0,1,1,1,1}};
        int present=0;
        int absent=0;
        int days=6;

        for(int i=0;i<5;i++){
            int sum=0;
            for(int j=0;j<6;j++){
              if(attendence[i][j]==1){
                sum++;
                
            }
                 present=sum;

                absent=days-present;
               
        } 
            
            System.out.println("Student:" +i+"Present days:" +present+"Absent days:"+absent);
           
        }
         System.out.println();
        }
    }

    

    

