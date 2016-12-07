import java.util.Scanner;
public class Metodos {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();
		if(numero == 0){
			System.out.println("0 No es un número entero");
		}
		else 
			System.out.println(esPrimo(numero));
		
		//leemos por escaner dos numeros 
		//llamar a un metodo para que nos dia si es numero primo o no
		mostrarDivisores(numero);
	}
	public static boolean esPrimo(int numero){
		boolean primo = true;
		for(int contador = 2;contador<=numero/2;contador++)
			if(numero % contador == 0){
				primo = false;
				break;
			}
				
			
		return primo;
		}
	public static void mostrarDivisores(int numero){
		for(int contador = 1;contador<=numero/2;contador++)
			if(numero % contador == 0){
				System.out.printf("El numero %d es divisor de %d%n",contador,numero);
			}
		
	}
		
}

