
package figuras;

import java.util.Scanner;


public class Circulo extends figuras {
    Integer radio;
    
    public void area(){
        Scanner capt = new Scanner(System.in);
        System.out.println("Ingrese el Radio del Circulo\t: ");
        radio=capt.nextInt();
        System.out.println("El area del Circulo es:" + (3.1416*(radio*radio)));
            System.out.println("Espere 10 segundos para regresar al menu principal");
    }
}
