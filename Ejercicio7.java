import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Escribe el lado a del triamgulo :");
        
        double a= entrada.nextDouble();
        
        System.out.println("Escribe el lado b del triamgulo :");
        
        double b= entrada.nextDouble();
        
        System.out.println("Escribe el lado c del triamgulo :");
        
        double c= entrada.nextDouble();
        
        
        double sem= (a+b+c)/2;
        
        System.out.println("El semiperimetro del triangulo es :"+sem);
        
        double area=Math.sqrt(sem*((sem-a)*(sem-b)*(sem-c)));
        
        System.out.println(" El area del triangulo es:"+area);
        
        double r=Math.PI*4;
        double r2=r*(Math.sqrt(sem*((sem-a)*(sem-b)*(sem-c))));
        double R=(a*b*c)/r2;
        
        DecimalFormat decimales = new DecimalFormat("0.000");
        double rr=R;
          
        System.out.println(" El circumradio de el triangulo es:"+decimales.format(R));        
        
       
        
    }
}

