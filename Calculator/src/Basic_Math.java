/*******************************************************
* Project : Java Calculator.                           *
* Author  : Craig Nichols.                             *
* Purpose : Class to define basic math operations.     *
*******************************************************/
public class Basic_Math 
{
	// Class variables.
	private float x;
	private float y;
	
	// Class Constructor. 
	Basic_Math(float InitialX, float InitialY)
	{
		x = InitialX;
		y = InitialY;
	}
	
	// Add Methods
	public float Add()
	{
		return(this.x + this.y);
	}
	public float Add(float x, float y)
	{
		return x + y;
	}
	
	// Subtract Methods.
	public float Subtract()
	{
		return (this.x - this.y);
	}
	public float Subtract(float x, float y)
	{
		return x - y;
	}
	
	// Multiplication Methods
	public float Multiply()
	{
		return (this.x * this.y);
	}
	public float Multiply(float x, float y)
	{
		return x * y;
	}
	
	// Division Methods
	public float Divide()
	{
		if(this.y == 0)
		{
			return -1;
		}
		else
		{
			return (this.x / this.y);
		}
	}
	public float Divide(float x, float y)
	{
		if(y == 0)
		{
			return -1;
		}
		else
		{
			return x / y;
		}
	}

	// Percentages
	public float Percentage()
	{
		if(this.x == 0)
		{
			return -1;
		}
		else
		{
			float temp = this.x / 100;
			return (temp * y);
		}
	}
	public float Percentage(float x, float y)
	{
		if(x == 0)
		{
			return -1;
		}
		else
		{
			float temp = x / 100;
			return (temp * y);
		}
	}
}
