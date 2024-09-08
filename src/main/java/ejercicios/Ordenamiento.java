
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {
    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        // TODO: Coloca aquí el código del ejercicio 5: Ordenamiento
        String salida ="";
        int[] org = new int[4];
        org[0]= numero1;
        org[1]= numero2;
        org[2]= numero3;
        org[3]= numero4;
        Arrays.sort(org);
        
        salida = (org[0]+" "+org[1]+" "+org[2]+" "+org[3]);
        return salida;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();
        
        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
