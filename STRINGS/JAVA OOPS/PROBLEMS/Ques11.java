public class Ques11 {
    public static void main(String args[]){
        int count=0;
        String n="navyasridurga";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i'|| n.charAt(i)=='o'|| n.charAt(i)=='u'){
                count++;
            }
           
            
        }
         System.out.println(count);
    }
    
}
