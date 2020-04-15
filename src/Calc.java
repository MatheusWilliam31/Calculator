public class Calc {
	public double A;
	public double B;

	public Calc(double a, double b) {
		A = a;
		B = b;
	}

	public double Addition() {
		double Result = A + B;
		return Result;
	}

	public double Subtraction() {
		double Result = A - B;
		return Result;
	}

	public double Multiplication() {
		double Result = A * B;
		return Result;
	}

	public double Division() {
		double Result = A / B;
		return Result;
	}

	public String toString() {
		return ("Resultado = ");

	}
}

