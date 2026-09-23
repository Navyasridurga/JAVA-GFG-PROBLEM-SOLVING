class Sum_of_Numbers{
   
        static int sum(int ...num){
            int  total=0;
            for(int n:num){
                total=total+n;
            }
            return total;


        }
         public static void main(String[] args) {
            System.out.println(sum(10));
            System.out.println(sum(10,20));

    }
}