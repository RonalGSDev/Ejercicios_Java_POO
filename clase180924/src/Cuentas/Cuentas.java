/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;

public class Cuentas {
    String noCuenta;
    String dpi;
    String cliente;
    String telefono;
    String direccion;
    float saldo;

    public Cuentas(String noCuenta, String dpi, String cliente, String telefono, String direccion, float saldo) {
        this.noCuenta = noCuenta;
        this.dpi = dpi;
        this.cliente = cliente;
        this.telefono = telefono;
        this.direccion = direccion;
        this.saldo = saldo;
    }
    
    
    public static void menu(){
        System.out.println("******** BANCO ********");
        System.out.println("* 1) Sumar valores    *");    
        System.out.println("* 2) Restar valores   *");    
        System.out.println("* 3) Mostrar Saldos   *");    
        System.out.println("* 4) Salir            *");    
        System.out.println("***********************");
    }
    
    public void abonar(double abono){
        this.saldo += abono;
    }
    
    public void debitar(double debito){
        this.saldo -= debito;
    }
    
}
