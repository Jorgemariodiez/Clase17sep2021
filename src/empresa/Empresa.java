
package empresa;

import empleado.Empleado;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Empresa {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int opcion;
       int contador=0;
       Empleado[] empleados=new Empleado[5];
       
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
           
           switch(opcion){
               
               case 1:
                   empleados[contador]=new Empleado();
                   System.out.println("Digite el id del empleado: ");
                   empleados[contador].setId(entrada.nextInt());
                   System.out.println("Digita el nombre:");
                   empleados[contador].setNombre(entrada.next());
                   System.out.println("Digite el cargo: ");
                   empleados[contador].setCargo(entrada.next());
                   System.out.println("Digite el salario: ");
                   empleados[contador].setSalario(entrada.nextInt());
                   System.out.println("Difgite el telefono: ");
                   empleados[contador].setTelefono(entrada.next());
                   System.out.println("Digite la direccion: ");
                   empleados[contador].setDireccion(entrada.next());
                   contador++;
                   
                                  
                   
                   
                   break;
               case 2:
                   break;
               case 3:
                   for(i=0; i<contador; i++){
                       System.out.println(empleados[i].getNombre());
                   }
                   break;
               case 4:
                   System.out.println("Proceso Terminado");
                   System.exit(0);
                   break;
                   
               default:
                   System.out.println("Opcion no valida");
                   break;
                   
           }
           
           
       }while(opcion != 4);
       
       
    }
    
}
