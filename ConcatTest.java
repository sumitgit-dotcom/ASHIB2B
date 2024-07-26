package javaprogram;

public class ConcatTest {
	public static String concatWithString(){
		 String t = "java";
		 for(int i = 0; i<10000;i++)
		 {
			 
			t = t+"Tpoint";
			
		 }
		 return t;
		 
		 
		 
	 }
	 public static String concatWithStringBuffer(){
		 
		 
	  StringBuffer sb = new StringBuffer("java");
	  for(int i = 0;i<10000;i++)
	  {
		  
		sb.append("Tpoint") ;
		
	  }
	  return sb.toString();
	  
	  
	 }
	 public static void main(String args[]){
		 
		 long StartTime = System.currentTimeMillis();
		 concatWithString();
		 System.out.println("time taken to concat a string" +(System.currentTimeMillis()-StartTime)+  "ms");
		 StartTime = System.currentTimeMillis();
	     concatWithStringBuffer();
		 System.out.println("time taken to concat a string buffer" +(System.currentTimeMillis()-StartTime)+   "ms");
		 
		 
	 }

}
