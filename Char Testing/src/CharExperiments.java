
public class CharExperiments
	{
	public static void main(String[] args)
		{
		//charTest1();
		//charTest2();
		charTest3();
		//I need charTest4;
		}

	public static void charTest1()
		{
		char ch1 = 88; // code for X 
		char ch2 = 'Y'; 
		System.out.print("ch1 and ch2: "); 
		System.out.println(ch1 + " " + ch2); 
		}
	
	public static void charTest2()
		{
		char ch1 = 'X'; 
		System.out.println("ch1 contains " + ch1); 
		ch1++; 		// increment ch1 
		System.out.println("ch1 is now " + ch1);
		}
	
	public static void charTest3()
		{
		Character ch1 = 'A'; 
		Character ch2 = '5';
		System.out.println(ch1 + " is a letter?  " + ch1.isLetter('A'));
		System.out.println(ch1 + " is a digit?  " + ch1.isDigit('A'));
		System.out.println(ch2 + " is a letter?  " + ch2.isLetter('5'));
		System.out.println(ch2 + " is a digit?  " + ch2.isDigit('5'));
		}
	}
