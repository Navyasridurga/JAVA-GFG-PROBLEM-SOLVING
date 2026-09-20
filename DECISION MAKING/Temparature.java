public class Temparature {
    public static void main(String[] args) {
        int temparature=13;

        if(temparature>=35){
            System.out.println("Hot");

        }
        else if(temparature>25 && temparature<34){
            System.out.println("Warm");
        }
        else if(temparature>15 && temparature<24){
            System.out.println("cool");
        }
        else{
            System.out.println("Cold");
        }

    }
    
}
