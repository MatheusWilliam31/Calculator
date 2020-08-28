import java.util.Locale;
import java.util.Scanner;

public class Calculer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o 1º valor: ");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.print("Entre com a operação que deseja realizar(+,-,*,/): ");
		char operador = sc.next().charAt(0);
		System.out.print("Entre com o 2º valor: ");
		sc.nextLine();
		double b = sc.nextDouble();

		Calc calc = new Calc(a, b);

		double soma = calc.addition();
		double subtracao = calc.subtraction();
		double multiplicacao = calc.multiplication();
		double divisao = calc.Division();

		if (operador == '+') {
			System.out.println(calc.toString()+ soma);
		} else if (operador == '-') {
			System.out.println(calc.toString()+ subtracao);
		} else if (operador == '*') {
			System.out.println(calc.toString()+ multiplicacao);
		} else {
			System.out.println(calc.toString()+ divisao);
		}

		sc.close();
	}

}
