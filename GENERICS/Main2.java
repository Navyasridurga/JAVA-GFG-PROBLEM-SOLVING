class Box<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getdata() {
        return data;
    }
}

public class Main2 {
    public static void main(String args[]) {
        Box<Integer> b1 = new Box<>();
        b1.setData(100);
        Box<String> b2 = new Box<>();
        b2.setData("sri durgs");
        System.out.println(b2.getdata());

    }
}