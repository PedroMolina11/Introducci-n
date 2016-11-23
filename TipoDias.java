import java.util.Scanner;
public class TipoDias{
   public static void main(String args[]){
      System.out.println("Introduce una palabra");
      Scanner sc = new Scanner(System.in);
      String diaSemana = sc.next();
      sc.close();
	System.out.println(diaSemana);
	switch (diaSemana.toLowerCase()){
         case "lunes":
	    System.out.println("Es día laborable");
	    break;
	 case "martes":
	    System.out.println("Es día laborable");
	    break;
	 case "miercoles":
	    System.out.println("Es día laborable");
	    break;
	 case "jueves":
	    System.out.println("Es día laborable");
	    break;
	 case "viernes":
	    System.out.println("Es día laborable");
	    break;
	 case "sabado":
	    System.out.println("Es día no laborable");
	    break;
	 case "domingo":
	    System.out.println("No laborable");
	    break;
	 default:
	   System.out.println("Eso no es un día");
	   break;
}}}
