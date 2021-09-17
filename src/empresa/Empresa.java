
package empresa;

import java.util.Scanner;


public class Empresa {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int opcion;
       
       do{
           System.out.println("Bienvenido");
           System.out.println("---------------------");
           System.out.println("1.Agregar empleado");
           System.out.println("2.Mostrar empleado");
           System.out.println("3.Mostar empleados");
           System.out.println("4.Salir");
           System.out.println("---------------------");
           System.out.println("");
           
           System.out.println("Digite una opcion");
           opcion = entrada.nextInt();
           
           
       }while(opcion != 4);
       
       
    }
    
}
