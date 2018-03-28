package ca.bcit.comp4655.ejb.statelss.calculator;

import javax.ejb.Stateless;

@Stateless( mappedName="CalculatorEJB" )
public class CalculatorBean implements CalculatorRemote, CalculatorLocal
{
	@Override
	public int add ( int augend, int addend )
	{
		return augend + addend;
	}

	@Override
	public int sub(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}

	@Override
	public int mul(int multiplicand, int multiplier ) {
		return multiplicand * multiplier ;
	}

	@Override
	public int div(int dividend, int divisor) {
		if(divisor  != 0 ) {
			return dividend / divisor;
		}
		return 0;
		
	}
	
	
}
