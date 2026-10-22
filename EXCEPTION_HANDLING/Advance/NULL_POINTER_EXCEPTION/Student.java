class Student{
    public static void main(String args[]){
        String name=null;
        try{
            System.out.println(name.length());
        }
        catch(NullPointerException e){
            System.out.println("Name is null");
        }
        finally{
            System.out.println("program");
        }
    }
}