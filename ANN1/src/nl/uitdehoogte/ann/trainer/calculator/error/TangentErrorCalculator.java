package nl.uitdehoogte.ann.trainer.calculator.error;

import java.io.Serializable;

public class TangentErrorCalculator implements ErrorCalculator, Serializable
{
	private static final long serialVersionUID = 610143577953410908L;

	public double calculateOutputError(double actualOutput, double expectedOutput)
	{
		return 2.0 / 3 * (1.7159 - (actualOutput * actualOutput)) * (expectedOutput - actualOutput);
	}
	
	public double calculateHiddenError(double actualOutput, double weight, double error)
	{		
		return 2.0 / 3 * (1.7159 - (actualOutput * actualOutput)) * (weight * error);
	}
}
