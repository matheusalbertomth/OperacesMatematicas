package numerosPrimos;

import java.util.Scanner;

public class Recursivo {

	static boolean ehPrimoRecursivo(int n, int i)
    {
 
        // Base cases
        if (n <= 2) {
            return (n == 2) ? true : false;
        } else if (n % i == 0) {
            return false;
        } else if (i * i > n) {
            return true;
        }
        return ehPrimoRecursivo(n, i + 1);
    }
     
    public static void main(String[] args)
    {
 
    	Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número :");
        int numero=scan.nextInt();
 
        for (int i = 2; i <= numero; i++) {
            if( ehPrimoRecursivo(i,2) )
                System.out.println(i + " é primo.");
        }  
    }
}
