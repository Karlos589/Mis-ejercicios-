
package metodos;

import java.util.Scanner;


public class Metodos {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
         
        SinRetornoSinParametro Saludo = new SinRetornoSinParametro ();
        SinRetornoConParametros NombreIngresado = new SinRetornoConParametros ();
        
        String Nombre = "";
        String retorno ="";
        
        Saludo.MostrarSaludo();
        
        System.out.println("Por favor, ingrese su nombre ");
        Nombre = input.nextLine();
        
        NombreIngresado.Nombre(Nombre);
        
        ConRetornoSinParametros objeto3 = new ConRetornoSinParametros();
        
        objeto3.departamento();
        
        System.out.println(retorno);
        
        ConRetornoConParametros objeto4 = new ConRetornoConParametros();
        int cc =0;
        int a = 0;
        int b = 0;
        
        
        System.out.println("Ingrese un numero: ");
        a = input.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        b = input.nextInt();
        
        System.out.println("Eliga el tipo de operacion 1)suma 2)resta 3)multiplicacion 4)dision");
        
        cc=objeto4.sumar(a,b);
        System.out.println("la suma es " + cc);
        
        cc=objeto4.restar(a,b);
        System.out.println("la resta es " + cc);
        
        cc=objeto4.Multiplicacion(a,b);
        System.out.println("la multiplicacion es " + cc);
        
        cc=objeto4.division(a,b);
        System.out.println("la division es " + cc);
        
    }
    
}
