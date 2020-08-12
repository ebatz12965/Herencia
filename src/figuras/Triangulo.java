
package figuras;

import java.util.Scanner;

public class Triangulo extends figuras {
    Integer base;
    Integer altura;

    @Override
    public void area(){
        Scanner capt = new Scanner(System.in);
        System.out.println("Ingrese la base del Triangulo\t: ");
        base=capt.nextInt();
        System.out.println("Ingrese la altura del Triangulo\t: ");
        altura=capt.nextInt();
        
        System.out.println("El area del Triangulo es:" + ((base*altura)/2));
        System.out.println("Espere 10 segundos para regresar al menu principal");
            
    }
}
