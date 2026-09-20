class Mobile_Game{
    public static void main(String[] args) {
        int character=3;
        int weapon=2;
        switch(character){
        case 1:
            System.out.println("Warrior");
            
            switch(weapon)
            {
            case 1:
                System.out.println("Sword");
                break;
            case 2:
                System.out.println("Axe");
                break;
            case 3:
                System.out.println("Hammer");
                break;
            }
            break;
        
        case 2:
            System.out.println("Mage");
           
            switch(weapon){
                case 1:
                    System.out.println("Fire Wand");
                    break;
                case 2:
                    System.out.println("Ice wand");
                    break;
                case 3:
                    System.out.println("Lightning staff");
                    break;
            }
            break;
        case 3:
            System.out.println("Archer");
            switch(weapon){
                case 1:
                    System.out.println("Bow");
                    break;
                case 2:
                    System.out.println("Crossbow");
                    break;
                case 3:
                    System.out.println("Magic Bow");
                    break;
                
            }
            break;

                
            }
    }

}

