/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4_guia3;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_4_guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, letra;
        
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
        letra = frase.substring(1,1);
        if(frase.toLowerCase().substring(0,1).equals("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
