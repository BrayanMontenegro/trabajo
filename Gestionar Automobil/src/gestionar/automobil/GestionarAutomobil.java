/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionar.automobil;

/**
 *
 * @author Oreki
 */
public class GestionarAutomobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovil auto1 = new
Automovil("toyota",2023,5,Automovil.tipoCom.GASOLINA,Automovil.tipoA.COMPACTO ,2,2,250,Automovil.tipoColor.AZUL);
auto1.imprimir();
auto1.setVelocidadActual(120);
System.out.println("Velocidad actual = " + auto1.velocidadActual);
auto1.acelerar(20);
System.out.println("Velocidad actual = " + auto1.velocidadActual);
auto1.desacelerar(50);
System.out.println("Velocidad actual = " + auto1.velocidadActual);
auto1.frenar();
System.out.println("Velocidad actual = " + auto1.velocidadActual);
auto1.desacelerar(20);
}

    }
    

