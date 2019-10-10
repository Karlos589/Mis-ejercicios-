
package arreglos;

import java.util.Scanner;

public class Arreglos {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int [] Notas = new int[5];
        
        for (int Estud = 0; Estud <= 4; Estud++) {
            System.out.println("Ingrese la calificacion del estudiante N: " + (Estud + 1) + " : ");
            Notas[Estud] = input.nextInt();
        }
        
        for (int Estud = 0; Estud <= 4; Estud++) {
            System.out.println("Estudiante N: " + (Estud + 1) + " : " + Notas[Estud]);
            
        }
    }
}   

    
