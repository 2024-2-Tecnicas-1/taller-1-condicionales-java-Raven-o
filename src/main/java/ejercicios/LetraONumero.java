
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        // TODO: Coloca aquí el código del ejercicio 4: Letra o número
        int letra = (int)caracter;
        String salida = "";
        
        if(letra>=48 && letra<=57){
            salida= "Es número";
        }else if (letra>=65 && letra<=90){
            salida= "Es letra mayúscula";
        }else if(letra>=97 && letra<=122){
            salida= "Es letra minúscula";
        }else{
            salida= "No es letra ni número";
        }
        System.out.println(letra);
        return salida;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
