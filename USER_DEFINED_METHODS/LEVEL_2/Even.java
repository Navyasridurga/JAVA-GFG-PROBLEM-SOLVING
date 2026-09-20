public class Even {
    void even(int num1){
        if(num1%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Even e1=new Even();
        e1.even(34);
    }
    
}
