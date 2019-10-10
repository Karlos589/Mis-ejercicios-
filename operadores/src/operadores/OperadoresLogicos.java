//Autor: Carlos Gutierrez

package operadores;

import java.util.Scanner;

public class OperadoresLogicos {
    
    public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    
    int Sede = 0;
    int Dia = 0;
    double ValorCompra = 0;
    int Edad = 0;
    
    
    System.out.print("ingrese la sede del almacen: ");
    Sede = input.nextInt();
    System.out.print("Ingrese el Dia de facturacion: ");
    Dia = input.nextInt();
    System.out.print("Ingrese el valor de la compra: ");
    ValorCompra = input.nextInt();
    System.out.print("Ingrese la edad: ");
    Edad = input.nextInt();
    
    if (Sede != 11001){
        System.out.println("Los descuentos no aplican para esta seda");
    }
    else{
    
    if ((Dia == 15 || Dia == 30) && ValorCompra >= 50000){
             ValorCompra = ValorCompra * 0.90;
             System.out.println("Felicitaciones tiene un descuento del 10%");
 }
    else if (Dia == 5 && Edad >= 65) {
        ValorCompra = ValorCompra * 0.95;
        System.out.println("Felicitaciones has obtenido un 5% de descuento");
    }
    }
    System.out.println("El valor de la compra es: " + ValorCompra);
            
    }    
}
