package javaprogram;

 class Polymorphism {
	public void treatPatient()
	{
		
	}
	class surgeon extends Polymorphism
	{
		public void treatPatient() {
			
		}
		
	}
	class body
	{
		public void main(String[] args) {
			Polymorphism	 docObj = new Polymorphism();
			docObj.treatPatient();
			surgeon sugObj = new surgeon();
			sugObj.treatPatient();
		
	}
	

	
		
		
		
		

	}

}
