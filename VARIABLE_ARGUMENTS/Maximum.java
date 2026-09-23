public class Maximum {
    static int max(int...numb){
        int max=0;
        for(int num:numb)
        if(max<num){
            max=num;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max(10,20));
        System.out.println(max(12,34,45));


        
    }
    
}
