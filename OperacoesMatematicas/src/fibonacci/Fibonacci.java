package fibonacci;

public class Fibonacci {
	int fibonacci(int n){
	    int ant=0, prox=1, result=0;
	    for (int i = 0; i < n; i++) {
	        result=ant+prox;
	        ant=prox;
	        prox=result;
	    }
	    return result;
	}
}
