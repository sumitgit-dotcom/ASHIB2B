package javaprogram;

public class Garbagecollection {
	int a, b;
	public void setData(int c,int d)
	{
		a=c;
		b=d;
	}
	public void showData()
	{
		
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
		
	}
	

	public static void main(String[] args) {
		Garbagecollection g1 = new Garbagecollection();
		Garbagecollection g2 = new Garbagecollection();
		g1.setData(1, 2);
		g2.setData(3, 4);
		g1.showData();
		g2.showData();
		
		
		
		

	}

}
