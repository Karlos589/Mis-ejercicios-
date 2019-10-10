/*Autor:Carlos Gutierrez*/
package condicionales;
import java.util.Scanner;

/**
 *
 * @author Sena
 */
public class If_anidado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contra1="12345";
        String contra;
        String usuario="carlos";
        String usuario1;

        System.out.println("Ingrese usuario");
        usuario1= input.nextLine();

        if (usuario1.equals(usuario)) {
            System.out.println("ingrese contraseña");
            contra= input.nextLine();
            if (contra.equals(contra1)) {
                System.out.println("Bienvenido");
            }
            else{
            System.out.println("ERROR de contraseña");
            }
        }
        else{
            System.out.println("Error de usuario");
        }
    }
}
