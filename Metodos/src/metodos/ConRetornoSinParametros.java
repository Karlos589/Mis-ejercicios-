
package metodos;

import java.util.Scanner;

public class ConRetornoSinParametros {
    
    public String departamento(){
        
        Scanner entrada =new Scanner (System.in);
        
        String animal ="";
        System.out.println("Su departamento de origen es: ");
        animal = entrada.next();
        return animal;
    
    }
            
    
}
