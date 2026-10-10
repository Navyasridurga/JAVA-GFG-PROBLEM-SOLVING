package cloninng;

public class GFG1 implements Cloneable{
String n;
int a;
public GFG1(String n,int a){
	this.n=n;
	this.a=a;
}
@Override
public Object clone() throws CloneNotSupportedException{
	return super.clone();
	
}
public String toString() {
	return "GFG{name:'"+n+"',age:"+a+'}';
	
}

	public static void main(String[] args) {
		
		try {
			GFG1 p3=new GFG1("navya",19);
			GFG1 g2=(GFG1) p3.clone();
			System.out.println("Original:"+p3);
			System.out.println("Cloned:"+g2);
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
	}
}

