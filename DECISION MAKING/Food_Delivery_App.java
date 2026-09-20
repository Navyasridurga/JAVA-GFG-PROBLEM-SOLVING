class Food_Delivery_App{
    public static void main(String args[]){
        int cuisine=3;
        int food=3;
        switch(cuisine){
            case 1:
                System.out.println("Sounth Indian");
                switch(food){
                    case 1:
                        System.out.println("Idli");
                        break;
                    case 2:
                        System.out.println("Dosa");
                        break;
                    case 3:
                        System.out.println("Vada");
                }
            
                break;
            case 2:
                System.out.println("Fast Food");
                switch(food){
                    case 1:
                        System.out.println("Burger");
                        break;
                    case 2:
                        System.out.println("Dosa");
                        break;
                    case 3:
                        System.out.println("Vada");
                        break;
            
                }
                break;
            case 3:
                System.out.println("Desserts");
            switch(food){
                case 1:
                System.out.println("Ice cream");
                break;
                case 2:
                    System.out.println("Cake");
                break;
                case 3:
                    System.out.println("Gulab Jammun");
                break;
            }
            break;
        }
    }
}