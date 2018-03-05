import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        
        
        System.out.println("Bienvenido a viajesmelgar.es");
        
        System.out.println("cuantas noches necesitan cotizar");
        
        double noches=entrada.nextDouble();
        
        System.out.println("cuantos estudiantes Gordos viajan?");
       
        double estudiantesgordos=entrada.nextDouble();
        
        System.out.println("cuantos estudiantes Flacos viajan?");
        
        double estudiantesflacos=entrada.nextDouble();
        
       double bus=40 ;// los buses que ofrecen la empresa de transporte son de 40 pasajeros
        double vbus=180000*2;
        
        double puestosbus= estudiantesflacos*(1);
        double puestosbus2=estudiantesgordos*(2);
        
        double totalpuestos=puestosbus+puestosbus2;
        
        double busestotales=totalpuestos/bus;
        
        double valortotalbuses=Math.ceil(busestotales)*vbus;
        
        //Alimentacion
        
        double desayuno=12000;
        double almuerzo=35000;
        double cena=20000;
        double snack=15000;
        
        double alimentoG=(desayuno*2)+almuerzo+cena+snack;
        double alimentoF=desayuno+almuerzo+cena;
        
        double totalalimentos=alimentoG+alimentoF;
        double totalalimentos2=(alimentoG+alimentoF)*noches;
        
        // habitaciones
        
        double Nhabitaciones=estudiantesgordos+estudiantesflacos;
              
        double costohabitacion=30000*Nhabitaciones;
        
        double totalnoches=costohabitacion*noches;
        
        double costoviaje=valortotalbuses+totalalimentos+totalnoches;
                      
        System.out.println("La cantidad total de estudiantes para el paseo es de :"+Nhabitaciones);
        
        System.out.println("El total de buses es de:"+Math.ceil(busestotales));
        
        System.out.println("El numero de habitaciones que necesitan los estudiantes es:"+Nhabitaciones);
        
        System.out.println("El valor total de los buses es de:"+valortotalbuses);
        
        System.out.println("El costo de la alimentacion por dia para los estudiantes es de:"+totalalimentos);
        
        System.out.println("El costo de la alimentacion total es de:"+totalalimentos2);
        
                
        System.out.println("El costo por dia de hospedaje es de :"+costohabitacion);
        
        System.out.println("El costo total del hotel es de :"+totalnoches);
        
        System.out.println("EL VALOR TOTAL DEL VIAJE ES DE :"+costoviaje);
        
            
        
        
    }
}
