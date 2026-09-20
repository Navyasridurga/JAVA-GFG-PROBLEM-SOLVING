class Question1{
void question(int[] marks){
        
        int length=marks.length;
        for(int i=0;i<length;i++){
            System.out.println(marks[i]);

        }
    }
        public static void main(String args[]){
            int marks[]={80,75,90,65,88};
            Question1 q1=new Question1();
          q1.question(marks);

        }

    }
