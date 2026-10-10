package cloninng;

public class Test {
	int x,y;
	

}

class Test2 implements Cloneable{
	int a,b;
	Test c=new Test();
	public Object clone() throws CloneNotSupportedException{
		Test2 t=(Test2)super.clone();
		t.c=new Test();
		t.c.x=c.x;
		t.c.y=c.y;
		return t;
		
	}
}

 class Main9{
	public static void main(String[] args) throws CloneNotSupportedException {
		Test2 t2=new Test2();
		t2.a=90;
		t2.b=98;
		t2.c.x=30;
		t2.c.y=45;
		Test2 t3= (Test2)t2.clone();
		t3.c.x=300;
		System.out.println(t2.a+" "+t2.b+" "+t2.c.x+" "+t2.c.y);
		
		System.out.println(t3.a+" "+t3.b+" "+t3.c.x+" "+t3.c.y);
	}
}
