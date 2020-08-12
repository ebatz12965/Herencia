
package figuras;

import java.util.Scanner;


public class Circulo extends figuras {
    Integer radio;
    
    @Override
    public void area(){
        Scanner capt = new Scanner(System.in);
        System.out.println("Ingrese el Radio del Circulo\t: ");
        radio=capt.nextInt();
        System.out.println("El area del Circulo es:" + (Math.PI) * Math.pow(radio,2));
            System.out.println("Espere 10 segundos para regresar al menu principal");
    }
}
