/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Oreki
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 CuentaBancaria cuenta = new CuentaBancaria("Elizabeth","catillo",25458,CuentaBancaria.tipo.CORRIENTE);
cuenta.imprimir();
cuenta.depositar(50000);
cuenta.depositar(582);
cuenta.retirar(60000);
System.out.println("Apartir de aqui inicia el segundo ejercicio");
System.out.println("------------------------------------------------------------- ");
CuentaBancaria cuenta2 = new CuentaBancaria("Cristian","Jarquin",954614,CuentaBancaria.tipo.CORRIENTE);
cuenta.depositar(0);
cuenta2.depositar(20000);
System.out.println("------------------------------------------------------------- ");
cuenta.compararCuentas(cuenta2);
cuenta.transferencia(cuenta2,5000000);
System.out.println("------------------------------------------------------------- ");
cuenta.consultarSaldo();
cuenta2.consultarSaldo();

}
    }
    
    
    
