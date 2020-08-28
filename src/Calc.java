public class Calc {
	public double a;
	public double b;

	public Calc(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double addition() {
		double result = this.a + this.b;
		return result;
	}

	public double subtraction() {
		double result = this.a - this.b;
		return result;
	}

	public double multiplication() {
		double result = this.a * this.b;
		return result;
	}

	public double Division() {
		double result = this.a / this.b;
		return result;
	}

	public String toString() {
		return ("Resultado = ");

	}
}

