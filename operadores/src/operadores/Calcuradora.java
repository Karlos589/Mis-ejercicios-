//Autor: Carlos Gutierrez Castro


package operadores;

import java.util.Scanner;

public class Calcuradora {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("===CALCURADORA===");
        //Declaramos variables
        
        int Num1 = 0;
        int Num2 = 0;
        int Resultado = 0;
        int TipoOperacion = 0;
        
        System.out.println("Seleccione el tipo de operacion");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        TipoOperacion = input.nextInt();
        
         if (TipoOperacion > 0 && TipoOperacion < 5){
        
        System.out.println("Ingrese el primer numero");
        Num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        Num2 = input.nextInt();
        
        if (TipoOperacion == 1){
        System.out.println("Usted ha seleccionado una suma");
        Resultado = Num1 + Num2;
        }
        
        else if (TipoOperacion == 2){
        System.out.println("Usted ha seleccionado una resta");
        Resultado = Num1 - Num2;
        }
        
        else if (TipoOperacion == 3){
       System.out.println("Usted ha seleccionado una multiplicacion");
        Resultado = Num1 * Num2;
        }
        
        else if (TipoOperacion == 4){
        System.out.println("Usted ha seleccionado una division");
        Resultado = Num1 / Num2;
        }
         
        System.out.println("El resultado es " + Resultado);
         }
        else {
         System.out.println("Seleccione  una opcion valida");
        }
        
       
   
    }
    
}
