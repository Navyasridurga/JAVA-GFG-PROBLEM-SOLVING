class Exam{
    public static void main(String args[]){
        int marks=25;
        int passmarks=35;
        try{
            try{
                if(marks<passmarks){
                    throw new Exception("nice");
                }

            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("Marks verification completed");
            }

        }
        finally{
            System.out.println("Exam proces ended");
        }
    }
}