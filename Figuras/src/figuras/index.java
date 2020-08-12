
package figuras;

import java.util.Scanner;

public class index {


   public static void main(String[] args) throws InterruptedException {
       int op;
       do{
       System.out.println("Seleccione una Opcion: ");
       System.out.println("1. Cuadrado");
       System.out.println("2. Triangulo");
       System.out.println("3. Circulo");
       System.out.println("4. Salir");
       Scanner capt = new Scanner(System.in);
       op = capt.nextInt();
   switch(op){
   case 1 :
       Cuadrado cua=new Cuadrado();
       cua.area();
       Thread.sleep(10000);
       System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
    break;
   
   case 2 :
       Triangulo tri=new Triangulo();
       tri.area();
       Thread.sleep(10000);
       System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
      break; 
      
      case 3 :
       Circulo cir=new Circulo();
       cir.area();
       Thread.sleep(10000);
       System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
      break;
      
      case 4:
          System.exit(0);
   
   default : 
       System.out.println("Seleccione la opcion correcta: ");
}
       }while(op != 4);
    }
    
}
