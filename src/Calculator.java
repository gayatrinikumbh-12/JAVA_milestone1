import java.util.Scanner;

public class Calculator {

	public static final String VERSION = "1.0.0";

	public void printVersion() {
		System.out.println("Calculator Version: " + VERSION);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numx, numy, result = 0;
		Calculator c = new Calculator();
		c.printVersion();
	
		Scanner sc = new Scanner(System.in);
		String ans = null;

		do {
			System.out.println("Welcome  \n Do you want to use calculator  \n Yes/No");
			ans=sc.next();
			if(ans.equalsIgnoreCase("Yes"))
			{
				
			
			
			System.out.println("Enter first number ");
			numx = sc.nextDouble();
			System.out.println("Enter Second number ");
			numy = sc.nextDouble();

			System.out.println("how many times you want to repeat the calculation.");
			int n = sc.nextInt();

			System.out.println("Select an operation:");
			System.out.println("Enter valid operation  + - / * ");

			char ch = sc.next().charAt(0);

			switch (ch) {
			case '+':
				System.out.println("You chose to add.");
				result = numx + numy;
				break;

			case '-':
				System.out.println("You chose to subtract.");
				result = numx - numy;
				break;
			case '*':
				System.out.println("You chose to multiply.");
				result = numx * numy;
				break;
			case '/':
				System.out.println("You chose to divide.");
				result = numx / numy;
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice.");
				break;

			}

			for (int i = 1; i <= n; i++) {
				System.out.println("print result " + result);
			}
			
			
			}else
			{
				ans = "No";
			}

		} while (!(ans.equalsIgnoreCase("No")));
		sc.close();
		System.out.println("Thank you . your session is ended");
	}
	
	

}
