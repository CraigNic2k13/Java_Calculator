/*******************************************************
* Project : Java Calculator.                           *
* Author  : Craig Nichols.                             *
* Purpose : Calculator main functions.                 *
*******************************************************/
public class Main 
{
	public static void main(String[] args)
	{
		Basic_Math b = new Basic_Math(20, 8);
		
		System.out.println(b.Add());
		System.out.println(b.Add(24, 80));
		
		System.out.println(b.Subtract());
		System.out.println(b.Subtract(100, 50));
		
		System.out.println(b.Divide());
		System.out.println(b.Divide(10, 5));
		
		System.out.println(b.Multiply());
		System.out.println(b.Multiply(10, 30));
		
		System.out.println(b.Percentage());
		System.out.println(b.Percentage(100, 5));
	} 

}
