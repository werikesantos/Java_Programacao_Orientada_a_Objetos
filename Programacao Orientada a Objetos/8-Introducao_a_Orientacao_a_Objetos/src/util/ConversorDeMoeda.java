package util;

public class ConversorDeMoeda{

	public static final double IOF = 0.06;

	public static double dollarParaReal(double resultar, double dollarPreco) {
		return resultar * dollarPreco * (1.0 + IOF);
	}
}