//AUTOR: Carlos Gutierrez Castro

package condicionales;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String PassSystem = "1234";
        String PassIngresada = "";
        System.out.println("Por favor ingrese su contraseña");
        PassIngresada = input.nextLine();
        
        if (PassIngresada.equals(PassSystem)) {
        System.out.println("Bienbenido uste ha ingresado correctamente ");
        }
        
        else {
        System.out.println("Contraseña incorrecta intentelo nuevamente");}
        
    }
}
