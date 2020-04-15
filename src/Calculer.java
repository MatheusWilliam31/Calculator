import java.util.Locale;
import java.util.Scanner;

public class Calculer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o 1º valor: ");
		double A = sc.nextDouble();
		sc.nextLine();
		System.out.print("Entre com a operação que deseja realizar(+,-,*,/): ");
		char Operador = sc.next().charAt(0);
		System.out.print("Entre com o 2º valor: ");
		sc.nextLine();
		double B = sc.nextDouble();

		Calc calc = new Calc(A, B);

		double soma = calc.Addition();
		double subtracao = calc.Subtraction();
		double multiplicacao = calc.Multiplication();
		double divisao = calc.Division();

		if (Operador == '+') {
			System.out.println(calc.toString()+ soma);
		} else if (Operador == '-') {
			System.out.println(calc.toString()+ subtracao);
		} else if (Operador == '*') {
			System.out.println(calc.toString()+ multiplicacao);
		} else {
			System.out.println(calc.toString()+ divisao);
		}

		sc.close();
	}

}
