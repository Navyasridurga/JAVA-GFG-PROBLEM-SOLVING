class Problem1 extends Thread{
    public void run(){
        System.out.println("Threading is run");

    }
    public static void main(String args[]){
        Problem1  t1=new Problem1();
        t1.start();
        t1.run();
    }
}