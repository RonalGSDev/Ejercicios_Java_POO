/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuentas;

import java.util.Scanner;

public class main {
    
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        double abono, debito;
        Cuentas cuenta1 = new Cuentas("106574", "1910-12234-0001", "Luis Fernando", "77655454", "zona 1", 0);
        Cuentas cuenta2 = new Cuentas("657474", "1095-06898-1301", "Erick Carrillo", "45336574", "zona 5", 0);
      
        
        
        do{
            Cuentas.menu();
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("--------------- ABONO A CUENTAS ---------------");
                    System.out.println(" 1) Cta No."+cuenta1.noCuenta +" - "+cuenta1.cliente);    
                    System.out.println(" 2) Cta No."+cuenta2.noCuenta +" - "+cuenta2.cliente);   
                    System.out.println(" 3) Regresar");  
                    System.out.println("------------------------------------------------3");
                    System.out.print("Ingrese una opcion: ");
                    op = sc.nextInt();
                    
                    switch(op){
                        case 1:
                            System.out.print("Ingrese la cantidad a abonar: Q");
                            abono = sc.nextDouble();
                            if(abono>0){
                                cuenta1.abonar(abono);
                            }else{
                                System.out.println("No se puede abona en negativo");
                            }
                            
                            break;
                            
                        case 2:
                            System.out.print("Ingrese la cantidad a abonar: Q");
                            abono = sc.nextDouble();
                            if(abono>0){
                                cuenta2.abonar(abono);
                            }else{
                                System.out.println("No se puede abona en negativo");
                            }
                            break;
                        
                        default:
                            System.out.println("Opcion no valida");
                            break;
                            
                    }
                    break;
                    
                case 2:
                     System.out.println("--------------- DEBITAR A CUENTAS ---------------");
                    System.out.println(" 1) Cta No."+cuenta1.noCuenta +" - "+cuenta1.cliente);    
                    System.out.println(" 2) Cta No."+cuenta2.noCuenta +" - "+cuenta2.cliente);   
                    System.out.println(" 3) Regresar");  
                    System.out.println("------------------------------------------------3");
                    System.out.print("Ingrese una opcion: ");
                    op = sc.nextInt();
                    
                    switch(op){
                        case 1:
                            System.out.println("Saldo actual: "+cuenta1.saldo);
                            System.out.print("Ingrese la cantidad a debitar: Q");
                            debito = sc.nextDouble();
                            if(debito>0 && cuenta1.saldo>=debito){
                                cuenta1.debitar(debito);
                            }else{
                                System.out.println("No se puedo realizar la operacion");
                            }
                            
                            break;
                            
                        case 2:
                            System.out.println("Saldo actual: "+cuenta2.saldo);
                            System.out.print("Ingrese la cantidad a debitar: Q");
                            debito = sc.nextDouble();
                            if(debito>0 && cuenta2.saldo>=debito){
                                cuenta2.debitar(debito);
                            }else{
                                System.out.println("No se puedo realizar la operacion");
                            }
                            break;
                        
                        default:
                            System.out.println("Opcion no valida");
                            break;
                            
                    }
                    break;
                    
                case 3:
                    System.out.println("--------------- SALDO DE CUENTAS ---------------");
                    System.out.println(" 1) Cta No."+cuenta1.noCuenta +" - "+cuenta1.cliente);    
                    System.out.println(" 2) Cta No."+cuenta2.noCuenta +" - "+cuenta2.cliente);   
                    System.out.println(" 3) Regresar");  
                    System.out.println("------------------------------------------------3");
                    System.out.print("Ingrese una opcion: ");
                    op = sc.nextInt();
                    
                    switch(op){
                        case 1:
                            System.out.println("El saldo de la cuenta No."+cuenta1.noCuenta+" es de Q"+cuenta1.saldo);
                            
                            break;
                            
                        case 2:
                            System.out.println("El saldo de la cuenta No."+cuenta2.noCuenta+" es de Q"+cuenta2.saldo);
                            
                            break;
                        
                        default:
                            System.out.println("Opcion no valida");
                            break;
                            
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("La opcion ingresada no existe");
                    break;
                    
            }
            
        }while(op!=4);
        
        
        
             
        
        
    }
}
