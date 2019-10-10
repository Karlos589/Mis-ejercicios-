
package metodos2;

import java.util.Scanner;

public class Metodos2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        ConRetorConPara FechaMes = new ConRetorConPara (System.in);
        
        int DiaNacimiento = 0;
        int MesNacimiento = 0;
        int AnyoNacimiento = 0;
        
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Ingrese el dia: ");
        DiaNacimiento = input.nextInt();
        System.out.println("Ingrese el mes: ");
        MesNacimiento = input.nextInt();
        System.out.println("Ingrese el año: ");
        AnyoNacimiento = input.nextInt();
       
    }
    
}
