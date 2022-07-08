package fibonacci;

import java.util.Scanner;

public class Linear {
	public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número :");
        int numero=scan.nextInt();
        Fibonacci fib = new Fibonacci();
        System.out.print(fib.fibonacci(numero));
    }
}