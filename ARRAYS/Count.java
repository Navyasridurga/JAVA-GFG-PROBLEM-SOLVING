public class Count {
    int count(int[]ele){
        int  count=0;
        for(int i=0;i<ele.length;i++){
            if(ele[i]==2){
                count++;
            }
            
        }
        return count;
    
    }
    public static void main(String[] args) {
        Count c1=new Count();
        int ele[]={2,5,2,8,2,9,5};

        System.out.println(c1.count(ele));
    }
    
}
