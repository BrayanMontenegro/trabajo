/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionar.personas;

/**
 *
 * @author Oreki
 */
public class persona {
    String nombre, apellido, cedula, pais;;
    int anac;
    char sexo;
    public persona(String nombrep, String apellidop, String cedulap, int anacimiento , String paisnac , char sexop) {
        this.nombre = nombrep;
        this.apellido = apellidop;
        this.cedula = cedulap;
        this.anac = anacimiento;
        this.pais = paisnac;
        this.sexo = sexop;
        
    }
    

 
void imprimir () {
    System.out.println("-------------------------------------------------------");
    System.out.println("Nombre"+nombre);
    System.out.println("apellido"+apellido);
    System.out.println("cedula"+cedula);
     System.out.println("Fecha de Nacimiento "+anac);
     System.out.println("Pais de Origen "+pais);
     System.out.println("sexo "+sexo);
}

     
  
    int determinarEdad(){
    return 2023-anac;
    
    
}


}
