public class Reverse {
    void reverse(int re[]){
        for(int i=re.length-1;i>0;i--){
            System.out.print(re[i]+" ");
        }

    }
    public static void main(String[] args) {
        int re[]={10,20,30,40,50};
        Reverse r1=new Reverse();
        r1.reverse(re);

    }
    
}
