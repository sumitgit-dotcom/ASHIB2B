package javaprogram;

class Finalmethod {
	void run()
	{
		
		System.out.print("running");	
		}
	class  Bike extends Finalmethod
	{
		
		
		void run()
		{
			
			System.out.print("running with 100 kmph");
			}
			
		public void main(String[] args)
			
			{
				Bike b = new Bike();
				b.run();
			}
			
		}
	}



