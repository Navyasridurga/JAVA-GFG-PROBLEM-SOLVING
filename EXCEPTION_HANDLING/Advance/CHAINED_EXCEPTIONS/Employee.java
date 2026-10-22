class Employee{
    public static void main(String args[]){
        IllegalArgumentException i1=new IllegalArgumentException("Invalid employee age");
        RuntimeException r1= new RuntimeException("employee registration failed");
        r1.initCause(i1);
        try{
            throw r1;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
                System.out.println(i1.getMessage());
        }
    }
}