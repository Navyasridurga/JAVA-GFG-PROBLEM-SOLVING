public class Exam1 {
    static void checkMarks(int marks) throws Exception {
        if (35 > marks) {
            throw new Exception("Failed in exam");
        }
        System.out.println("passed in exam");
    }

    public static void main(String[] args) {
          try{
            checkMarks(28);

            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        
    }
    System.out.println("Result checking completed");

}

}
