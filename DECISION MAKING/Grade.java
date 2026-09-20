public class Grade {
    public static void main(String[] args) {
        int marks=82;
        if(marks>90 && marks<100){
            System.out.println("A grade");
        }
        else if(marks>75 && marks<89){
            System.out.println("B grade");
        }
        else if(marks>60 &&marks<74){
            System.out.println("C grade");
        }
        else if(marks>35 && marks<59){
            System.out.println("D grade");
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
