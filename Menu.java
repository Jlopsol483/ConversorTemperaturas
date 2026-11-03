import java.util.Scanner;
public class Menu {
    public static void CelFar(float temp) {
       temp=(float)(temp*1.8)+32;
        System.out.println("La temperatura introducida, en farenheit, es la siguiente: "+temp);
    }
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int opcion=0;
        float temp=0;
        while (opcion!=4) {
            System.out.println("--- CONVERSOR DE TEMPERATURAS ---");
            System.out.println("1) Celcius a Farenheit");  //Jose
            System.out.println("2) Farenheit a Celcius"); //David
            System.out.println("3) Celcius a Kelvin");  //Pablo
            System.out.println("4) Finalizar");
            System.out.print("Opción:");
            opcion= teclado.nextInt(); 
            while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4) {
                System.out.print("Opción invalida. Intentelo de nuevo:");
            }
            if (opcion==1) {
                System.out.print("Inserte la temperatura deseada:");
                temp= teclado.nextFloat();
                CelFar(temp);
            }
            else if (opcion==2) {
                System.out.print("Inserte la temperatura deseada:");
                temp= teclado.nextFloat();
                System.out.print("Introduce la temperatura en grados Fahrenheit: ");
                double fahrenheit = teclado.nextDouble();

                double celsius = (fahrenheit - 32) / 1.8;

                System.out.printf("%.2f °F equivalen a %.2f °C.%n", fahrenheit, celsius);

            }
            else if (opcion==3) {
                System.out.print("Inserte la temperatura deseada:");
                temp= teclado.nextFloat();
                //Insertar C-K
            }
            System.out.println("");

        }
        System.out.println("Programa finalizado.");
    }
}
