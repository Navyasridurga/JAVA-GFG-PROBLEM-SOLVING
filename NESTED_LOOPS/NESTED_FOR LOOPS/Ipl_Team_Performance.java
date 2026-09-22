public class Ipl_Team_Performance {
    public static void main(String[] args) {
        int [][]runs={
            {180,145,210,175},
            {160,190,155,220},
            {200,185,170,195}
        };
       
               
            
                for(int i=0;i<3;i++){
                    int sum=0;
                    int highestScore=0;
                     int overall_Highest=0;

                    for(int j=0;j<4;j++){
                        sum+=runs[i][j];
                         
                
                int average=sum/4;
               
                        
                       
                        if(highestScore<runs[i][j])
                            {
                                highestScore=runs[i][j];

                        
                       
                        if(overall_Highest<highestScore){
                            overall_Highest=highestScore;
                            
                        }
                        }
                        int team=0;
                       
                        if(highestScore<team){
                            team=highestScore;
                           
                        }
                          
                       
                
                    
                System.out.println("Team"+(i+1));
                 System.out.println("Sum:"+sum);
                
                System.out.println("overall Highest"+overall_Highest);
               
                    
                    System.out.println("Average:"+average);
                    }
                 
                        
            }
        }
        }
    

