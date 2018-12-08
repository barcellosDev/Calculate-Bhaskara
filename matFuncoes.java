import java.util.Scanner;

public class matFuncoes
{
	public static void main(String[] args)
	{
		// Programando bhaskara em Java
		double a, b, c, delta, x1, x2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		x1 = (-b + Math.sqrt(delta)) / (2*a);
		x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		System.out.printf("O valor de x1 é: %f\nO valor de x2 é: %f", x1, x2);
		sc.close();
	}
}