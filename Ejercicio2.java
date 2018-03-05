import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("ingrese cantidad de carga que necesita de nuestro producto en kg");
		
		double b_s= 53.6;//kilometros
		double carga= in.nextDouble();//en kilos
		double viaje= 1.8; // 1.8 galones por kilometro recorrido
		double capacidad= 13; //18 kilos es la capacidad del camion
		
		float numv= (int) (1*carga/capacidad);
		
		double numg= viaje*b_s; 
		
		double gasolina= numv*numg;
		
		System.out.println("El numero de viajes que necesita es :"+ numv);
		
		System.out.println("El numero de galones de gasolina que necesita es:"+ gasolina);
		
		
		
		
		
		
	
		
		
}
}
		
