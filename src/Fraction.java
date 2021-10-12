
public class Fraction {
	
	int num;
	int den;	
	
	Fraction(int num, int den)
	{
		this.num = num;
		this.den = den;		
	}
	
	public String toString()
	{	
		return num + "/" + den + "=" + (float)num/den; 
	}
}

