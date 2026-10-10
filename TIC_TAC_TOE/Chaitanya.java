class  Main{
    public static void main(String args[]){
        String s="chaitan_ya_r_a_j";
        String d=" ";
        String h=" ";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                if(ch=='_'){
                    d=d+ch;

                }
                else{
                   h=h+ch;
                }
            }
            System.out.println(h);
        }
    
}