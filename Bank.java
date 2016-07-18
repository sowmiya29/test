 abstract class GeneralBank
{

	abstract double getFixedInterestRate();
	abstract int getsavingInterestRate1();
	}
class ICICI extends  GeneralBank
{

int getsavingInterestRate1()
{
	int savings=4;
	return savings;
}
double getFixedInterestRate()
{
	double fixed=8.5;
	return fixed;
	}
}
 class KotMbank extends  GeneralBank
{
	
	
	double getFixedInterestRate()
	{
		int fixed=6;
		return fixed;
		
	}
	
	int getsavingInterestRate1()
	{
		int savings=9;
		return savings;
		
	}
}
	
public class Bank {

	public static void main(String[] args)
	{   GeneralBank obj=new ICICI();
		System.out.println(obj.getFixedInterestRate()+"%"+"\n"+obj.getsavingInterestRate1());
		ICICI objICICI=new ICICI();
		System.out.println(objICICI.getFixedInterestRate()+"%");
		System.out.println(objICICI.getsavingInterestRate1()+"%");
		KotMbank objkotMbank=new KotMbank();
		System.out.println(objkotMbank.getFixedInterestRate()+"%");
        System.out.println(objkotMbank.getsavingInterestRate1()+"%");
	}

}
