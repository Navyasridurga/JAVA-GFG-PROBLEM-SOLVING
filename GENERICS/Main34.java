class Box{
    public static void main(String[] args) {

        Box<String> b1 = new Box<>();
        b1.setValue("Navya");

        Box<Integer> b2 = new Box<>();
        b2.setValue(100);

        Box<Double> b3 = new Box<>();
        b3.setValue(99.5);

        System.out.println(b1.getValue());
        System.out.println(b2.getValue());
        System.out.println(b3.getValue());
    }
}