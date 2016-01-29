/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Buscaminas {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tamanno;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite el tamaño del cuadro de 2 en adelante");
            tamanno = teclado.nextInt();
            if (tamanno <= 0) {
                System.out.println("Numero no valido");
                System.out.println("");
            }
        } while (tamanno < 2);
        
        tablero tab1=new tablero(tamanno);
       
        tab1.dibujarCampo();
        

    }

}
