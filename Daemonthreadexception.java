package javaprogram;
 class Daemonthreadexception extends Thread
 {
	 public void run()
	 {
		 
		 System.out.println("name" +Thread.currentThread().getName());
		 System.out.println("daemon" +Thread.currentThread().isDaemon());
		 
	 }
	 

	public static void main(String[] args) {
		Daemonthreadexception t1 = new Daemonthreadexception();
		Daemonthreadexception t2 = new Daemonthreadexception();
		t1.start();
		t1.setDaemon(true);
		t2.start();
		
		

	}

}
