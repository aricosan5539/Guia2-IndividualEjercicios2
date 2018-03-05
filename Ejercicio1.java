
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Escribe la base superior :");	
		
	double b= entrada.nextDouble();
	
	System.out.print("Escribe la base inferior :");
	
	double B= entrada.nextDouble();
	
	System.out.print("Escribe la altura :");
	
	double h= entrada.nextDouble();
		
	
	float areab=(int) Math.pow(b, 2);
	
	float areaB= (int)Math.pow(B, 2);
	
	float perimetro= (int)(h*b+h*B)/2;
	
	
	double areatotaltronco= areab+areaB+(perimetro*h);
	
	double raiz= Math.sqrt(areab*areaB);
	
	
	double Volumen=(h/3)*(areab+areaB+raiz);
	
	
	System.out.println("El área del tronco de pirámide es:" +areatotaltronco);
	
	System.out.println("El volumen del tronco es:" +Volumen);
	
	
	
	
	
	
	
	

	}

}