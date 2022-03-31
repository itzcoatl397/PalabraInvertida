
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        
        /*
         i = 0 
        */
        
        
        Scanner entrada = new Scanner(System.in);
        String  palabra ,invertida = "";
        
        System.out.println("Ingrese una  palabra : ");
        palabra = entrada.nextLine();
        int  len  =  palabra.length();
       
        
      
        
        while (len  !=0 ) {   
         
            invertida += palabra.substring(len-1, len);
            len--;
        }
        System.out.println("La Palabra invertida "+invertida );
        
    }
    
}
