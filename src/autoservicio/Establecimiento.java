//Bonilla Medina Arturo
/*No estoy seguro si se pusieron de acuerdo mis compañeros 
de la sala 2 para hacer en llamada el que mandaron ellos
pero como no pude participar en el suyo hice el mio */
package autoservicio; 

import java.util.Scanner;

public class Establecimiento {
     private String nombre;
     private int capacidad;
     private double metros;
     private int actual;
     
    public Establecimiento() {
    } //Constructor por defecto

    public int getActual() {
        return actual;
    }

    public void setActual(int gente) {
        this.actual = gente;
    }

    
    public int getCapacidad() {
        return capacidad;
    } //getter variable capacidad

     
  
    public Establecimiento(String nombre, int capacidad, double metros) {
        this.nombre = nombre;
        this.capacidad =(int)metros/5;
        this.metros = metros;
    }//Constructor parametrizado completo

    public String getNombre() {
        return nombre;
    }//Getter variable nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//setter variable nombre

    public double getMetros() {
        return metros;
        
    }// getter variable metros

    public void setMetros(double metros) {
        this.metros = metros;
        this.capacidad =(int)metros/5;
    }//setter variable metros
     
    public void ingresoYSalida(char c, Establecimiento o1){
        int ingreso;
        Scanner v = new Scanner(System.in);
    if (c=='E'||c=='e') {                                                       //Comparamos el caracter ingresado con las opciones
                System.out.println("¿Cuantas personas van a ingresar?");                
                ingreso=v.nextInt();
                if (o1.getActual()<o1.getCapacidad() && (o1.getActual()+ingreso)<=o1.getCapacidad()) {        //Comprobamos que las personas que vayan a ingresar sean menos que las que caben actualmente
                    o1.setActual(o1.getActual()+ingreso);                                                         //En caso de que sean menos, se aumenta el numero de personas que estan adentro
                    System.out.println("Bienvenido a "+o1.getNombre()+"\nPor contingencia solo se permite la entrada a "+o1.getCapacidad()+" personas ");
                    System.out.println("Ahora hay "+o1.getActual()+" personas dentro");
                } else {
                    System.out.println("Ahora hay "+o1.getActual()+" personas dentro");
                    System.out.println("Lo sentimos no puede ingresar hasta que salgan más personas");  //En caso de que sea mayor enviamos un mensaje para informar que no se puede pasar
                }
            } else if(c=='S'||c=='s') {                                                     //Condicional segundo parte del caracter comparado
                System.out.println("¿Cuantas personas van a salir?");
                o1.setActual(o1.getActual()-v.nextInt());                                           //Si van a salir, se descuentan los que van a salir del total
                System.out.println("Ahora hay "+o1.getActual()+" personas dentro");
                System.out.println("Gracias por visitarnos, vuelva pronto");
            }
    }
    
    @Override
    public String toString() {
        return "Establecimiento{" + "nombre:" + nombre + ", capacidad:" + capacidad + ", metros:" + metros + '}';
    }

}
    
