public class Atm_Trans {
    public static void main(String[] args) {
        int customers[][]={{500,1000,200,800,300},
                            {1500,70,40,200,900},
                            {300,600,1000,500,200},
                            {800,400,700,300,1200}
    };
    for(int i=0;i<4;i++){
        int total_trans=0;
        int max=customers[i][0];
        int min=customers[i][0];
        

        for(int j=0;j<5;j++){
            total_trans+=customers[i][j];
            if(customers[i][j]>max){
                max=customers[i][j];
                }
            if(customers[i][j]<min){
                min=customers[i][j];
            }
            
            
        
    }
    System.out.println("Customer: "+i+"\nTotal"+total_trans);
   
       System.out.println("Highest"+max);
       System.out.println("lowest: "+min);  
        
    }
}
}
