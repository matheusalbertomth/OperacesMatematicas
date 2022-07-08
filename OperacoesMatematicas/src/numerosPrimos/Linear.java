package numerosPrimos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Linear {
	
    private static boolean ehPrimoLinear(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }

	public static void main(String[] args) {    
		 
    	Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número :");
        int numero=scan.nextInt();
 
        for (int i = 2; i <= numero; i++) {
            if( ehPrimoLinear(i) )
                System.out.println(i + " é primo.");
        }    
    }
    
     
}
