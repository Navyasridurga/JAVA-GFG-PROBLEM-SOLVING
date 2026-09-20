public class Chanllenge1 {
    int net(int[]watch){

        int count=0;
        for(int i=0;i<watch.length;i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Chanllenge1 c1=new Chanllenge1();
        int watch[]={120,95,150,80,135};
       System.out.println(c1.net(watch));

    }
    
}
