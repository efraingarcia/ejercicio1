
package pkg109.pkg6.numerospromedio;
import java.util.Scanner;

public class NumerosPromedio {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        int i;
        int pos = 0, neg = 0; 
        int[] numeros = new int[100]; 
        double sumaPos = 0, sumaNeg = 0; 
        
        
        System.out.println("DIGITE LON NUMEROS POR FAVOR: ");
        for (i = 0; i < 100; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }

        //recorrer el array para sumar por separado los números positivos 
         // y los negativos  
        for (i = 0; i < 100; i++) {
            if (numeros[i] > 0){ //sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ //sumar negativos
                sumaNeg += numeros[i];
                neg++;
            }
        }

        //Calcular y mostrar las medias 
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }
    }
}
   
   

