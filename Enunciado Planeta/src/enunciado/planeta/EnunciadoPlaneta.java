/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enunciado.planeta;

/**
 *
 * @author Oreki
 */
public class EnunciadoPlaneta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 planeta tierra = new planeta("Tierra",1,5.9736,1.0832,127,1500,planeta.tipoPlaneta.TERRESTRE,true);
tierra.imprimirdatos();
System.out.println("Densidad del planeta = " + tierra.calcularDensidad());
System.out.println("Es planeta exterior = " +tierra.CalcularPlanetaExterior());
System.out.println();
planeta mercurio = new planeta("Jupiter",79,1.89,1.43,139,7500,planeta.tipoPlaneta.GASEOSO,true);
mercurio.imprimirdatos();
System.out.println("Densidad del planeta = " +mercurio.calcularDensidad());
System.out.println("Es planeta exterior = " +mercurio.CalcularPlanetaExterior());

    }
    
}
