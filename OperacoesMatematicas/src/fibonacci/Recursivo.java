package fibonacci;

import java.util.Scanner;

public class Recursivo {
	public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número :");
        int numero=scan.nextInt();
        Fibonacci fib = new Fibonacci();
        if(numero == 0) {
        	System.out.println(numero);
        } else if(numero == 1) {
        	System.out.println(numero);
        } else {
        	System.out.println((fib.fibonacci(numero - 1)) + (fib.fibonacci(numero - 2)));
        }
    }
}
