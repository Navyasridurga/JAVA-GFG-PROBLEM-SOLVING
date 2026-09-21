public  class Hospital {
    public static void main(String[] args) {
        double temp_record[][]={
                              {98.2,99.1,100.2,98.7},
                              {101.1,99.5,98.9,100.5},
                              {90.8,98.6,102.1,99.0}

                              };
                          
        
        for(int i=0;i<3;i++){
             
            int count=0;
            double max=temp_record[i][0]; 
            double min=temp_record[i][0];
            for(int j=0;j<4;j++){
                
            System.out.print(temp_record[i][j]+" ");
                if(temp_record[i][j]>100){
                    count++;

                }
                
                if(temp_record[i][j]>max){
                    max=temp_record[i][j];
                }
                 if(min>temp_record[i][j]){
                    min=temp_record[i][j];

                }
                System.out.println();

            }
           
            System.out.println("100 F kanna ekkuva temparature unna patients count:"+count);
            System.out.println("Highest Temparature:"+max);
            System.out.println("Loweast Temarature:"+min);
            }
        }
    }


    

