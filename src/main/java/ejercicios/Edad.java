
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        // TODO: Coloca aquí el código del ejercicio 6: Edad
        LocalDate currentDate=LocalDate.now();
        int diaact=currentDate.getDayOfMonth();
        int mesact=currentDate.getMonthValue();
        int annoact=currentDate.getYear();
        
        int edad=0;
        
        if(mesact < mes){
            if(diaact < dia){
                edad=Math.abs(anno-annoact)-1;
            }
        }else{
            edad=Math.abs(anno-annoact);
        }
    
        return "Usted tiene "+edad+" años";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
