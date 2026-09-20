public class Challenge2 {
    int swiggy(int order[]){
        int count=0;

        for(int i=0;i<order.length;i++){
            if(order[i]>=200){
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        Challenge2 c1=new Challenge2();
        int order[]={250,120,450,80,300};
       System.out.println(c1.swiggy(order));

    }
}
