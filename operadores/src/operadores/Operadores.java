//Autor: Carlos Gutierrez  Castro
package operadores;

import java.util.Scanner;


public class Operadores {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
       System.out.println("===SUMA===");
       int Num1 = 0;
       int Num2 = 0;
       int Resultado = 0;
       
       System.out.println("Ingrese un numero entero ");
       Num1 = input.nextInt();
       
       System.out.println("Ingrese el segundo entero ");
       Num2 = input.nextInt();
       
       Resultado =Num1 + Num2;
       System.out.println("Resultado: " + Resultado);
       
        System.out.println("===RESTA=== ");
        int Num3 = 0;
        int Num4 = 0;
        int Resultado2 = 0;
       
        System.out.println("Ingrese un numero entero ");
        Num3 = input.nextInt();
        
        System.out.println("Ingrese el segundo entero ");
        Num4 = input.nextInt();
        
        Resultado2 = Num3 - Num4;
        System.out.println("Resultado: " + Resultado2);
        
         System.out.println("===MULTIPLICACION===");
         int Num5 = 0;
         int Num6 = 0;
         int Resultado3 = 0;
         
         System.out.println("Ingrese un numero entero ");
         Num5 = input.nextInt();
         
         System.out.println("Ingrese el segundo entero ");
         Num6 = input.nextInt();
         
         Resultado3 = Num5 * Num6;
         System.out.println("Resultado: " + Resultado3);
          
          System.out.println("===DIVISION===");
          int Num7 = 0;
          int Num8 = 0;
          int Resultado4 = 0;
          
          System.out.println("Ingrese un numero entero ");
          Num7 = input.nextInt();
          
          System.out.println("Ingrese el segundo entero ");
          Num8 = input.nextInt();
          
          Resultado4 = Num7 / Num8;
          System.out.println("Resultado: " + Resultado4);
          
       
        
    }
    
}
