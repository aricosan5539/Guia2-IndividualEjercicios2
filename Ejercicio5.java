import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String []args) {
        Scanner entrada= new Scanner(System.in);;

        System.out.println(">> Avion");
        double clase_1, clase_2, clase_3;

        System.out.println("Cantidad de pasajeros primera clase:");
        clase_1 = entrada.nextDouble();

        System.out.println("Cantidad de pasajeros de segunda clase:");
        clase_2 = entrada.nextDouble();

        System.out.println("Cantidad de pasajeros de tercera clase:");
        clase_3 = entrada.nextDouble();

        double total = clase_1* 500000 + clase_2* 200000 + clase_3 * 125000;
        System.out.println("> Costo total de los vuelos: " + total);

    }

}
