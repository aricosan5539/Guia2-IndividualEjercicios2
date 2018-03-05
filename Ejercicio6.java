import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Escribe el lado del Hexagono :");
        
        double L= entrada.nextDouble();
        
        double ap=(L/1.15);// el 1.15 es el resultado de la tangente de 30 °
        
        DecimalFormat decimalesap = new DecimalFormat("0.00");
        double numero =ap;
        
        System.out.println("el apotema del Hexagono es:"+decimalesap.format(numero));
        
        double area=3*L*ap;
        
        DecimalFormat decimales = new DecimalFormat("0.000");
        
        double area1 =area;
        
       
        System.out.println(" El area del Hexagono es:"+decimales.format(area1));
        
        
        
        
}
}

        
        
