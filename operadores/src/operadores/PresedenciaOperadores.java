//Autor: Carlos Gutierrez


package operadores;

import java.util.Scanner;

public class PresedenciaOperadores {
    
        public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        int nota1 = 7;
        int nota2 = 7;
        int nota3 = 2;
        double resultado = 0;
        
        resultado = (nota1+nota2+nota3)/3;
        
        System.out.println("El promedio de la nota es: " + resultado);
        
        System.out.println("===============================");
         
       int sede1 = 55;
       int sede2 = 62;
       int sede3 = 41;
       int resultado2 = 0;
       
       resultado2 = (sede1+sede2+sede3)*3;
       
       System.out.println("el total de boletas a imprimir son: " + resultado2);
                
                }

    
}
