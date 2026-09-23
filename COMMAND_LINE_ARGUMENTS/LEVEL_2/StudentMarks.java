class StudentMarks{
    public static void main(String[] args) {
        String name=args[0];
        int subject1=Integer.parseInt(args[1]);
        int subject2=Integer.parseInt(args[2]);
        int subject3=Integer.parseInt(args[3]);
        System.out.println("Name:"+name);
        System.out.println("Total:"+(subject1+subject2+subject3));
        System.out.println("Average:"+(subject1+subject2+subject3)/3);


    }
}