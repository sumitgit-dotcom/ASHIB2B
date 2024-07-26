package javaprogram;

  public class Encap1 {
	  private String name;
	  private int age;
	  
	  public String getName()
	  {
		return name;
		
		   }
	  public void setName()
	  {
		  this.name = name;
	  }
	  public int getAge()
	  {
		return age;
		  
		  }
	  public void setAge(int age)
	  
	  {
		  
		  if(age>0) {
			  this.age = age;
		  }
			 
	  
	  else
	  {
		  
		  System.out.print("invalid age");
	  }
	  
	  
	  
	  
	
		
		

	}

