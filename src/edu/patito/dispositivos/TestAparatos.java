/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.dispositivos;

import java.util.Scanner;

/**
 *
 * @author faysyo
 */
public class TestAparatos {
    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
         int eleccion=0;
         
         System.out.println(" que deseas comprar? ");
         System.out.println(" 1) Lapton");
         System.out.println(" 2) PCGamer");
         System.out.println(" 3) Servidor");
         System.out.println(" 4) PC");
         System.out.println(" 5) Phone Apple");
         System.out.println(" 6) Phone Huawei");
         System.out.println(" 7) Phone Samsung");
         System.out.println(" 8) Tablet IPad");
         System.out.println(" 9) Table Android");
         
         try {
             
             System.out.print(" Elige el numero: ");
             eleccion = entrada.nextInt();
             
        } catch (Exception e) {
             System.out.println(" Ingrese un numero valido");
        }
         switch (eleccion) {
                 case 1:
                     Computadora lp= new Computadora("HP", "Windows 11", "Intel Core 7", "8gb", 19000.0f);
                     System.out.println(lp);
                     break;
                 case 2:
                     Computadora pg= new Computadora("Gamer Xtreme", "Windows 11", "Intel Celeron", "16gb", 24000.0f);
                     System.out.println(pg);
                     break;
                 case 3:
                     Computadora ser = new Computadora("lenovo", "Windows Server 2022", "Intel Xenon", "16gb", 83000.0f);
                     System.out.println(ser);
                     break;
                 case 4:
                     Computadora pc= new Computadora("DELL", "Windows 10", "Intel Core 3", "4gb", 8000.0f);
                     System.out.println(pc);
                     break;
                 case 5:
                     SmartPhone ios= new SmartPhone("IphoneX", "OS X 10.10.5", "Telcel", "250gb", 18500.0f);
                     System.out.println(ios);
                     break;
                 case 6:
                     SmartPhone adr= new SmartPhone("Samsung galaxy S22", "Android 12", "Movistar", "128gb", 21000.0f);
                     System.out.println(adr);
                     break;
                 case 7:
                     SmartPhone hu= new SmartPhone("Huawei P50 Pro", "EMUI 12", "AT&T", "250gb", 22000.0f);
                     System.out.println(hu);
                     break;
                 case 8:
                     Tablet ip= new Tablet("iPad Pro 2020", "IPad OS", false, 17500.0f);
                     System.out.println(ip);
                     break;
                 case 9:
                     Tablet tb= new Tablet("Acer One 7", "No disponible", true, 7500.0f);
                     System.out.println(tb);
                     break;
                 default:
                     throw new AssertionError();
             }
         
         
         
    }
    
}
