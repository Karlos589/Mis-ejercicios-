/* trabajando con variables
Autor: Carlos Gutierrez 
*/
package variables;

/**
 *
 * @author APRENDIZ
 */
public class Variables {

    public static void main(String[] args) {
        /* creando las variables */
        String MiNombre;
        int ResultadoPrueba;
        double Estatura;
        boolean Activo; 
        String MisApellidos;
        int Zapatos;
        int IDFicha;
        double PuntajeSisben;
        
        /* Inicializanso las variables*/
        MiNombre = "Carlos";
        ResultadoPrueba = 250;
        Estatura = 1.76;
        Activo = true;
        MisApellidos = "Gutierrez Castro";
        Zapatos = 40;
        IDFicha = 1802853;
        PuntajeSisben = 32;
        
        System.out.println("MiNombre"+ MiNombre + " " + MisApellidos);
        System.out.println("ResultadoPrueba"+ ResultadoPrueba);
        System.out.println("Estatura" + Estatura);
        System.out.println("Activo" + true);
        System.out.println("Zapatos" + Zapatos);   
        System.out.println("IDFicha" + IDFicha);
        System.out.println("PuntajeSisben" + PuntajeSisben);
        
        /* inicializar o declarar variable*/
        
        String Producto1 = "Manzana";
        int Valor1 = 800;
        String Producto2 = "Lulo";
        int Valor2 = 500;
        String Producto3 = "Piña";
        int Valor3 = 900;
        
        System.out.println("Lista de precios");
        System.out.println(Producto1 + "...Valor $" + Valor1);
        System.out.println(Producto2 + "...Valor $" + Valor2);
        System.out.println(Producto3 + "...Valor $" + Valor3);
        
        
    }
    
}
