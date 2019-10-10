/*Autor: Carlos Gutierrez*/


package interactivas;

import java.util.Scanner;

public class While {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int maximo = 0;
        int numeropart = 1 ;
        String numerodoc = "";
        
   
        System.out.println("==Registro de participantes==");
        System.out.println("ingrese el numero de participantes: " + maximo);
        maximo = entrada.nextInt();
        System.out.println("Cupo maximo " + maximo);
        
        while (numeropart <= maximo ){
            System.out.println("Participante Numero: " + numeropart );
            System.out.println("Por favor ingrese su numero de documento: ");
            numerodoc = entrada.next();
            numeropart = numeropart + 1;
        }
            System.out.println("Proceso Finalizado");

    }
}
