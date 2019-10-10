//Aprendiz: Carlos Gutierrez
package operadores;


import java.util.Scanner;

public class OperadoresRelacionales {
    
            public static void main(String[] args){
                
                Scanner input = new Scanner (System.in);
            
                int Numero1 = 0;
                int Numero2 = 0;
                
                System.out.println("Ingrese el primer numero: ");
                Numero1 = input.nextInt();
                
                System.out.println("Ingrese el segundo numero: ");
                Numero2 = input.nextInt();

                if (Numero1 > Numero2){
                    System.out.println("El numero " + Numero1 + " es mayor a " + Numero2);
                }
                
                if (Numero1 < Numero2){
                    System.out.println("El numero " + Numero2 + " es mayor a " + Numero1);
                }
                
                if (Numero1 == Numero2){
                    System.out.println("Los numeros son iguales");
                }
            
            }

    
}
