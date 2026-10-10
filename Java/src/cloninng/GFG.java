package cloninng;

public class GFG implements Cloneable {
	int x, y;

	GFG() {
		x = 90;
		y = 89;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		GFG g1 = new GFG();
		GFG g2 = (GFG) g1.clone();
		System.out.println("g1:" + g1.x + " " + g1.y);
		System.out.println("g2:" + g2.x + " " + g2.y);

	}
}
