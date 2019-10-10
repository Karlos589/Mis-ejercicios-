
package repaso;

import java.util.Scanner;

public class Repaso {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String User = "";
        String Userbd = "Carlos";
        String PassWord = "";
        String PassUser = "12345";
        
        
        
        System.out.println("Ingrese su nombre: ");
        User = input.nextLine();
    
        System.out.println("Ingrese contraseña ");
        PassWord = input.nextLine();        
        
        if (User.equals(Userbd)  && PassWord.equals(PassUser)) {
            System.out.println("Bienvenido acaba de iniciar sesion " + Userbd);
        }
        
        else if (!User.equals(Userbd))  {
            System.out.println("Usuario no existe");
        }
         if (User.equals(Userbd) && !PassWord.equals(PassUser)) {
            System.out.println("Error de contraseña");
        }
    
    }
    
}
