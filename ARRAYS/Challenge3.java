public class Challenge3 {
    int challenge3(int likes[]){
        int count=0;
        for(int i=0;i<likes.length;i++){
            if(likes[i]>200){
                count++;
            }
        }
        return count;

    }
    public static void main(String args[]){
        int likes[]={250,120,450,80,300};
        Challenge3 c1=new Challenge3();
        System.out.println(c1.challenge3(likes));

    }
    
}
