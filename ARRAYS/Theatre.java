public class Theatre {
    String movie(int seats[]){
         seats[2]=1;
         seats[1]=1;
        for(int i=0;i<seats.length;i++){
         
        System.out.print(seats[i]+" ");

        }
        return "seat booked ";

}
    public static void main(String[] args) {
        int []seats={0,0,0,0,0};
        Theatre t1=new Theatre();
      String result= t1.movie(seats);

       System.out.println("\n"+result);
    }
}
