package ca.bcit.comp4655.ejb.statelss.calculator;

public interface Calculator 
{
	public int add ( int augend, int addend );
	public int sub (int minuend, int subtrahend);
	public int mul (int multiplicand, int multiplier );
	public int div (int dividend, int divisor);
}
