import java.util.Scanner;
public class Triangulo{
	public static void main(String args[]){
		System.out.println("Introduce la medida de un lado");
		Scanner sc = new Scanner(System.in);
		double ladoTriangulo = sc.nextDouble();
		double areaTriangulo = calcularArea(ladoTriangulo);
		double perimetro = calcularPerimetro(ladoTriangulo);
		System.out.println("El area es ---> " + areaTriangulo);	
		System.out.println("El perimetro es ---> " + perimetro);
	}
	
	public static double calcularArea(double ladoTriangulo){
		double area;
		double h;
		double medioLado = ladoTriangulo/2;
		h = Math.sqrt((ladoTriangulo * ladoTriangulo) - (medioLado * medioLado));
		area = (ladoTriangulo * h)/2;
		return area;	
	}
	public static double calcularPerimetro(double ladoTriangulo){
		return ladoTriangulo*3;
	}
}
