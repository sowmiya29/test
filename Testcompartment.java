import java.util.concurrent.ThreadLocalRandom;

abstract  class Compartment
{
	abstract void notice();
	}
class FirstClass extends Compartment
{

	
	void notice() 
	{
		
		System.out.println("In firstclass");
	}
	
	}
class Ladies extends Compartment
{

	
	void notice() 
	{
		System.out.println("In ladies");
		
	}
	}
class General extends Compartment
{

	
	void notice() 
	{
		System.out.println("In general");
		
	}
	
	}
class Luggage extends Compartment
{

	
	void notice()
	{
		
		System.out.println("In luggage");
	}
	
	}
public class Testcompartment {

	

	static int getrandom(int x,int y)
	 {
		 int random = ThreadLocalRandom.current().nextInt(1,4);
		 return random;
	 }
	
	public static void main(String[] args) 
	{
	
 Compartment[] compartment=new Compartment[10];int random;
 
    
   for(int i=0;i<10;i++)
   {
	  random=getrandom(1,4);
	   switch(random)
	   {
	   case 1:
		 compartment[i]=new FirstClass();
		   break;
	   case 2:
		   compartment[i]=new Ladies();break;
	   case 3:
		   compartment[i]=new General();break;
	   case 4:
		   compartment[i]=new Luggage();break;
	   }
	   compartment[i].notice();
   }
  
      
	}

	
	}


