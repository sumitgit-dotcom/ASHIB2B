package javaprogram;
interface bank{
	
	float roi();
	
}
class sbi implements bank{
	
	public float roi() {
		
		return 10.75f;
	}
	class pnb implements bank{
		
		public float roi()
		{
			return 9.25f;
		}
	}
}


public class Javainterface {

	public static void main(String[] args) {
		bank a = new sbi();
		System.out.println("rate of interest : " +a.roi());



	}

}
