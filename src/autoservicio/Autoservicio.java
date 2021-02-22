//Bonilla Medina Arturo
/*No estoy seguro si se pusieron de acuerdo mis compañeros 
de la sala 2 para hacer en llamada el que mandaron ellos
pero como no pude participar en el suyo hice el mio */
package autoservicio;

import java.util.Scanner;
 
public class Autoservicio { 
 
    public static void main(String[] args) { 
        Establecimiento e1=new Establecimiento();
        Scanner v = new Scanner(System.in);             //declaracion de variables
        int  ingreso;
        char c;
        
        System.out.println("Ingrese el tamaño del establecimiento en m2"); 
        e1.setMetros(v.nextDouble());                                       //Lectura por teclado de una variable miembro de e1
        System.out.println("Ingrese el nombre del establecimiento");
        e1.setNombre(v.next());                                             //Lectura por teclado de una variable miembro de e1
                                    //Llamamos al metododesde la clase Establecimiento para calcular la capacidad de e1 establecimiento
        System.out.println(e1.toString()+"\n");                             //Usamos el metodo toString() sobreescrito para mostrar los datos del objeto
        do {            
           System.out.println("Ingrese E si está entrando o S si está saliendo, porfavor"); 
           System.out.println("En caso de cierre del establecimiento ingrese cualquier otra letra");
           c=v.next().charAt(0);                                                       //tomamos por teclado un caracter 
           e1.ingresoYSalida(c, e1);
           
            
        } while (c=='E'||c=='e'||c=='S'||c=='s');                                           //Repite las instrucciones hasta que el caracter sea diferente a (E-e)ntrada o (S-s)alida
        
        
       
    }
    
}
