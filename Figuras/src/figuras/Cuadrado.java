
package figuras;

import java.util.Scanner;




public class Cuadrado extends figuras { //cuando la clase hija no es abstracta se tiene que implementar los metodos
                                        //de la clase padre
    
    Integer base;
    Integer altura;
    
        public void area(){
        Scanner capt = new Scanner(System.in);
        System.out.println("Ingrese la base del cuadrado\t: ");
        base=capt.nextInt();
        System.out.println("Ingrese la altura del cuadrado\t: ");
        altura=capt.nextInt();
        
        System.out.println("El area del Cuadrado es:" + (base*altura));
            System.out.println("Espere 10 segundos para regresar al menu principal");
           
            
    }

}
