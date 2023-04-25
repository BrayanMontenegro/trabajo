/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras.geometricas;

/**
 *
 * @author Oreki
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo1 = new Circulo(5);
        System.out.println("El Area del circulo es " +circulo1.CalcularArea());
          System.out.println("El Perimetro del circulo es " +circulo1.CalcularPerimetro());
                      System.out.println("----------------------------------------------------------------");
            
          cuadrado cuadradro1 = new cuadrado(6, 7, 8);
     System.out.println("El Area del cuadrado es " + cuadradro1.CalcularArea());
          System.out.println("El Perimetro del cuadrado es " + cuadradro1.CalcularPerimetro());
         
          System.out.println("----------------------------------------------------------------");
          
          rectangulo rectangulo1 = new rectangulo(8, 6);
                  System.out.println("El Area del rectangulo es " +rectangulo1.CalcularArea());
                      System.out.println("El Perimetro del rectangulo  es " + rectangulo1.CalcularPerimetro());
             System.out.println("----------------------------------------------------------------");
             
             Triangulo Triangulo1 = new Triangulo(7, 2, 3, 1, 5);
             System.out.println("La Hipotenusa del Triangulo es "+ Triangulo1.CalcularHipotenusa());
                System.out.println("El Perimetro del Triangulo es "+ Triangulo1.CalcularPerimetro());
                   System.out.println("La El Area del Triangulo es "+ Triangulo1.CalcularArea());
               System.out.println("Entonces El tipo de triangulo es");
               Triangulo1.tipoTriangulo();
               System.out.println("----------------------------------------------------------------");
             Rombo rombo1 = new Rombo(5, 8);
             System.out.println("El area del rombo es " + rombo1.calcularArea());
             System.out.println("El perimetro del rombo es " + rombo1.calcularPerimetro());
             System.out.println("----------------------------------------------------------------");
             Trapecio trapecio1 = new Trapecio(8, 4, 4);
             System.out.println("El area del trapecio es " + trapecio1.calcularArea());
             System.out.println("El perimetro del trapecio es " + trapecio1.calcularPerimetro());
    }
    

            
    
    
    
}
