class Movie_Ticket_Booking_APP{
    public static void main(String[] args) {
        
    int genre=2;
    int movie=2;
    switch(genre){
        case 1:
        System.out.println("Action");
        switch(movie){
            case 1:
                System.out.println("Avengers");
                break;
            case 2:
                System.out.println("John Wick");
                break;
            case 3:
                System.out.println("Fast & Furious");
                break;
        }
        break;
        case 2:
            System.out.println("Comedy");
            switch(movie){
            case 1:
                System.out.println("Idiots");
                break;
            case 2:
                System.out.println("HangOver");
                break;
            case 3:
                System.out.println("Jathi RRatnalu");
                break;
            }
            break;
            case 3:
                System.out.println("Horror");
                switch(movie){
                    case 1:
                    System.out.println("Conjuring");
                    break;
                    case 2:
                        System.out.println("Insidious");
                    break;
                    case 3:
                        System.out.println("Annabelle");
                    break;
                }
                break;
                


            }
    
        }
    
    }

    
