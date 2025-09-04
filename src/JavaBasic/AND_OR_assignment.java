package JavaBasic;

public class AND_OR_assignment {

	public static void main(String[] args) {

		/*
		 * Assignment 1: Voter Eligibility Write a program to check if a person is
		 * eligible to vote: - The person should be 18 or older. - The person must be a
		 * citizen of the country. Use both & and && to show the difference in behavior.
		 */
		
		int person = 18;
		boolean citizen = false;
		
		if (person >= 18 && citizen) {
			System.out.println("Eligible for voting");
		}else System.out.println("Not eligible");
		
		
		/*
		 * Assignment 2: Login Check Assume two boolean values: boolean
		 * isUsernameCorrect = true; boolean isPasswordCorrect = false; Use: - & and &&
		 * to print whether login is successful or not. - | and || to explore the
		 * behavior when one of the credentials is correct.
		 */
		 boolean isUsernameCorrect = true;
		 boolean isPasswordCorrect = true;
		 
		 
		 if (isUsernameCorrect && isPasswordCorrect ) {
			 System.out.println("User is logges in");
		 }else System.out.println("Incorrect credentials");

		 
		 if (isUsernameCorrect || isPasswordCorrect) {
			 System.out.println("Incorrect username/ passowrd");
		 }else System.out.println("both wrong");
		 
		 
			/*
			 * Assignment 3: Discount Eligibility A user is eligible for a discount if: -
			 * Their total purchase amount is above 1000 - OR they are a premium member Use
			 * || and | to check discount eligibility.
			 */
		 
		 int totalPurchse = 200;
		 boolean  priMember = false;
		 
		 if(totalPurchse > 1000 || priMember ) {
			 System.out.println("Eligible for the discount");
		 }
		 else System.out.println("Not eligible for the discount");
		 
		 
		 
			/*
			 * Assignment 4: Find the Greatest of Four Numbers Write a program to find the
			 * greatest of four numbers using logical && and if-else.
			 */
		 

			int b1= 10;
			int b2= 90;
			int b3= 10;
			int b4 = 90;
			
			int temp = 0;
			
			if (b1>b2 && b1>b3 && b1>b4)
			{
				System.out.println("b1 is gretest number");
			}
			else if (b2>b3 && b2>b4)
			{
				System.out.println("b2 is gretest number");
			}
			else if (b3>b4)
			{
				System.out.println("b3 is gretest number");
			}
			else System.out.println("b4 is the greatest number");
			
			
			
			
			//Another way
			

			if (b1>temp)
			{
				temp = b1;
			}
			 if (b2>temp)
			{
				temp=b2;
			}
			 if (b3>temp)
			{
				temp=b3;
			}
			if (b4> temp) {
				temp=b4;
			}
			
			System.out.println("Largest = " + temp);

			
			/*
			 * Assignment 5: Short-Circuit Behavior Create a method printMessage() that
			 * prints a message and returns true. Use this method in: if (x > 5 ||
			 * printMessage()) Then change to: if (x > 5 | printMessage()) Observe the
			 * output difference.
			 */
		 
			int x= 3;
			if (x > 5 | printMessage()) {
				System.out.println("Inside if");
			}else System.out.println("Inside else");
			
			
			/*
			 * Assignment 6: Access Control A user can access a secure area if: - They are
			 * an admin - OR (they are a user AND their access level is above 5) Write
			 * boolean logic using isAdmin, isUser, accessLevel.
			 */
			
			boolean isAdmin= true;
			boolean isUser= false;
			byte accessLevel =8;
			
			if (isAdmin || (isUser && accessLevel>5)) {
				System.out.println("Access granted");
			}else System.out.println("Access not granted");
			
		
			

	}
	
	
	public static boolean printMessage() {
	
		return true;
		
	}

}
