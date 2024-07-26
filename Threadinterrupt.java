package javaprogram;

 class Threadinterrupt extends 	Thread	 {
	 public void run()
	 {
		 try {
			 
			 Thread.sleep(1000);
			 System.out.println("thread task");
			 }
		 catch(InterruptedException e)
		 {
			 throw new RuntimeException("thread exception" +e);
			 
		 }
		 
		 }

	public static void main(String[] args) {
		Threadinterrupt t1 = new Threadinterrupt();
		t1.start();
		try {
			
			
			t1.interrupt();
		}
		catch(Exception e)
		{
			
			System.out.println("exception handled" +e);
		}
		
		

	}

}
