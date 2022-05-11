/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.factory;

import edu.patito.dispositivos.Computadora;
import edu.patito.dispositivos.SmartPhone;
import edu.patito.dispositivos.Tablet;

/**
 *
 * @author faysyo
 */
public class DispositivoFactory {
    public static Dispositivo createDispositivo(int tipo){
        switch (tipo) {
            case Dispositivo.COMPUTADORA_lAPTOP:
                return new Computadora("HP", "Windows 11", "Intel Core 7", "8gb", 19000.0f);
            case Dispositivo.COMPUTADORA_GAMER:
                return  new Computadora("Gamer Xtreme", "Windows 11", "Intel Celeron", "16gb", 24000.0f);
            case Dispositivo.COMPUTADORA_SERVIDOR:
                return new Computadora("lenovo", "Windows Server 2022", "Intel Xenon", "16gb", 83000.0f);
            case Dispositivo.COMPUTADORA_PC:
                return new Computadora("DELL", "Windows 10", "Intel Core 3", "4gb", 8000.0f);
            case Dispositivo.TELEFONO_APPLE:
                return new SmartPhone("IphoneX", "OS X 10.10.5", "Telcel", "250gb", 18500.0f);
            case Dispositivo.TELEFONO_ANDROID:
                return new SmartPhone("Samsung galaxy S22", "Android 12", "Movistar", "128gb", 21000.0f);
            case Dispositivo.TELEFONO_HARMONY:
                return new SmartPhone("Huawei P50 Pro", "EMUI 12", "AT&T", "250gb", 22000.0f);
            case Dispositivo.TABLETA_IPAD:
                return new Tablet("iPad Pro 2020", "IPad OS", false, 17500.0f);
            case Dispositivo.TABLETA_ANDROID:
                return new Tablet("Acer One 7", "No disponible", true, 7500.0f);
                
            default:
                throw new AssertionError();
        }
    }
}
