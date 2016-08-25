
public class referenceExample {

	private static void incrementNumber(int num)
	{
		num++;
		
		System.out.println("Inside method - number set to ..." + num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		
		System.out.println("Initialised number set to ..." + number);
		
		incrementNumber(number);
		
		System.out.println("Outside method - number set to ..." + number);
	}

}
