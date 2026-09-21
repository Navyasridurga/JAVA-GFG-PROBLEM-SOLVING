public class Ipl_Score_Board {
    public static void main(String[] args) {
        int teams[][]={{180,165,192},
        {155,201,174},{210,188,156},{175,190,205}};
        int score=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                
               int team1=teams[i][j];
               score+=team1;
                

            }
             System.out.println(score);
            
             
        }
        
          
        }
    }
    

