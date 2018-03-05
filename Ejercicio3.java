import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Escribe el radio de la base superior :");	
		
	double r= entrada.nextDouble();
	
	System.out.print("Escribe el radio de la base inferior :");
	
	double R= entrada.nextDouble();
	
	System.out.print("Escribe la altura :");
	
	double h= entrada.nextDouble();
	
	double pi= Math.PI;
	
	double vol= h*pi/R;
	
	double vol2= Math.pow(R,2)+Math.pow(r, 2)+(R*r);
	
	double Volumen= vol*vol2;
	
	DecimalFormat decimales = new DecimalFormat("0.000");
	
	double Volumen1=Volumen;
	
	
	System.out.println("El volumen de un tronco de cono es:" +decimales.format(Volumen));
	

	}

}

