package NestedInterface;

public interface Gfg {
	void show();
	interface InnerInterface{
		void msg();
	}

}
 class Test implements Gfg.InnerInterface{
	public  void msg() {
		System.out.println("Message from nested Interface inside an interface");
		
	}
	public static void main(String[] args) {
		Gfg.InnerInterface obj=new Test();
		obj.msg();
	}
	
}
 
