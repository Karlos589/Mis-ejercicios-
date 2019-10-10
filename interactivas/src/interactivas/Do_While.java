// Autor: Carlos Gutierrez


package interactivas;

import java.util.Scanner;

public class Do_While {

    public static void main(String[] args){
    
    Scanner entrada = new Scanner (System.in);
    
    String ClaveUser = "";
    String ClaveBD = "1234";
    int numintentos = 1;
    
    System.out.println("login");
    do{
        System.out.println("Ingrese la  clave");
        System.out.println("intento " + numintentos);

        ClaveUser = entrada.next();
        numintentos++;
    }while (!ClaveUser.equals(ClaveBD) && numintentos < 4);
    if (numintentos == 4 && !ClaveUser.equals(ClaveBD))
        
    
     System.out.println("Acceso no permitido");
    
    else {
     System.out.println("Bienvenido");
    }
    
    
}
    }
