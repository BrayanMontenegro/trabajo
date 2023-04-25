/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionar.personas;

/**
 *
 * @author pais;
 */
public class GestionarPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       persona objetoPersona = new persona(" Elizabeth"," Castillo"," 123-310904-1003T", 2004," Nicaragua" , 'M');
        objetoPersona.imprimir();
      
       persona Presidente= new persona("  Cristian"," Jarquin"," 121-108873-1003H", 2005,"nicaragua" , 'M');
       Presidente.imprimir();
    }
    
}
