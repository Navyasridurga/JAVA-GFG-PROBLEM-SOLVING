class Movie_Theatre_Booking_Report{
    public static void main(String[] args) {
        int [][][] seats={
           { {1,0,1,1,0,0},
            {1,1,0,0,1,0},
            {0,1,1,0,0,1},
            {1,0,0,1,1,1},
            {0,0,1,1,0,1}
        },
        {
            {1,1,1,0,0,1},
            {0,1,0,1,1,0},
            {1,0,1,1,1,1},
            {0,0,0,1,1,0},
            {1,1,0,0,1,0}
        }
           
    };
        for(int i=0;i<2;i++){
            int total_seats=30;
            int booked_seats=0;
            int available_seats=0;
             int max=0;
             int booking_Percentage=1;
             
            for(int j=0;j<5;j++){
                for(int k=0;k<6;k++){
                    if(seats[i][j][k]==1){
                        booked_seats++;
                        available_seats=total_seats-booked_seats;
                        booked_seats=total_seats-available_seats;
                          booking_Percentage=(booked_seats*100/30);

                    }
                   
                    if(max<seats[i][j][k]){
                        max=seats[i][j][k];
                    }
                   
                    
                }
                
            }
            System.out.println("screen"+(i+1));
            System.out.println("Booked Seats:"+booked_seats);
            System.out.println("Available_Seats:"+available_seats);
            System.out.println("max booked row:"+max);
            System.out.println("Screen_Wise Booking Percentage:"+booking_Percentage);
        }
        }

    }
