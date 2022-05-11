/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

import java.util.Scanner;

/**
 *
 * @author faysyo
 */
public class TestAparatosFatory {
    public static void main(String[] args) {
         Scanner entrada= new Scanner(System.in);
         int eleccion=0;
         
         System.out.println(" ¿Qué deseas comprar? ");
         System.out.println();
         System.out.println(Dispositivo.COMPUTADORA_lAPTOP + ") Lapton");
         System.out.println(Dispositivo.COMPUTADORA_GAMER + ") PCGamer");
         System.out.println(Dispositivo.COMPUTADORA_SERVIDOR + ") Servidor");
         System.out.println(Dispositivo.COMPUTADORA_PC + ") PC");
         System.out.println(Dispositivo.TELEFONO_APPLE + ") Phone Apple");
         System.out.println(Dispositivo.TELEFONO_ANDROID + ") Phone Huawei");
         System.out.println(Dispositivo.TELEFONO_HARMONY + ") Phone Samsung");
         System.out.println(Dispositivo.TABLETA_IPAD + ") Tablet IPad");
         System.out.println( Dispositivo.TABLETA_ANDROID + ") Table Android");
         
         try {
             System.out.println();
            System.out.print(" Elige el numero: ");
             eleccion = entrada.nextInt();
        } catch (Exception e) {
             System.out.println(" Selecciona un numero de Dispositivo");
        }
         
         Dispositivo equipo= DispositivoFactory.createDispositivo(eleccion);
         System.out.println(equipo.toString());
    }
}
