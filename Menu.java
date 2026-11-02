import java.util.Scanner;
public class Menu {
    
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
            System.out.print("Inserte la temperatura deseada:");
            temp= teclado.nextFloat();
            if (opcion==1) {
                //insertar C-F
            }
            else if (opcion==2) {
                //Insertar F-C
            }
            else if (opcion==3) {
                //Insertar C-K
            }
            System.out.println("");

        }
        System.out.println("Programa finalizado.");
    }
}