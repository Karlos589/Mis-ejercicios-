//Carlos Gutierrez

package condicionales;

import java.util.Scanner;

public class switch1 {
        public static void main(String[] args){
            
            Scanner input = new Scanner (System.in);
            
            int numestudiantes = 1;
            int notestudiantes = 1;
            int estevaluados = 1;
            int contestudiante = 1;
            int contexelente = 0;
            int contbueno = 0;
            int contregular = 0;
            int contmalo = 0;
            System.out.println("==Registro de calificacion==");
            
            System.out.println("Ingrese el numero de estudiantes: ");
            numestudiantes = input.nextInt();
            
            while (estevaluados <= numestudiantes) {
            System.out.println("Ingrese la nota del estudiante numero: " + contestudiante );
            notestudiantes = input.nextInt();
            estevaluados++;
            contestudiante++;
            }
            
            while (contestudiante <=numestudiantes){
            switch(notestudiantes){
                case 10:
                case 9:
                    contexelente++;
                    break;
                case 8:
                case 7:
                case 6:
                    contbueno++;
                    break;
                case 5:
                case 4:
                    contregular++;
                    break;
                case 3:
                case 2:
                case 1:
                    contmalo++;
                    break;
                    
        }
            
            }
            
                                System.out.println("Excelente " + contexelente );
                                System.out.println("Bueno " + contbueno );
                                System.out.println("Regular " + contregular );
                                System.out.println("Malo " + contmalo );
            
                                    





   }
 
}       
