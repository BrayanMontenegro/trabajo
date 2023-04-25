/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.geometricas;

/**
 *
 * @author Oreki
 */
public class cuadrado {
    double Area,radio,lado;
    public cuadrado(double Area, double radio, double lado) {
        this.Area = Area;
        this.radio = radio;
        this.lado = lado;
    }
    
    
    
    
     double CalcularArea() {
  return(lado*lado);
      
     
  }
 double CalcularPerimetro(){
     return (lado*lado*lado*lado);
 
 }
 
 

    
    
}
