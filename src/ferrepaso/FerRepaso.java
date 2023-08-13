/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferrepaso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FerRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //for
        /*
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
         */
        //while
        /*
        boolean contador = true;
        while (contador ) {  
            System.out.println("Deseas continuar? S/N");
            String opcion = leer.nextLine();
            if (opcion.equals("N")){
                contador = false;
            }
        }
         */
        String[] nombreProductos = new String[5];
//        nombreProductos [0] = "Cola";
//        nombreProductos [1] = "doritos";
//        nombreProductos [2] = "sprite";
//        nombreProductos [3] = "chupete";
//        nombreProductos [4] = "galleta";

        //System.out.println(nombreProductos[4]);
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del producto");
            nombreProductos[i] = leer.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println(nombreProductos[i]);

            }
        }

        //dowhile
        /*
        int contador = 0;
        do {            
            System.out.println(contador);
            contador++;
        } while (contador == 1);
         */
    }

}
