/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author Dxracso
 */
public final class tablero {
    
    int campo[][];
    
    int digitosArea;
    
    public tablero(int tamanno) {
        int cantidadMinas = (int) Math.abs(((Math.pow(tamanno, 2)) * 0.4) + 1);
        System.out.println("Cantidad de Minas en el mapa: " + cantidadMinas);

        int campo[][] = new int[tamanno][tamanno];

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {

                campo[i][j] = 0;
            }
        }
        
int pocisionRandom=(int) ((Math.random()) * (Math.pow(10,(digitosArea + 1))));;
        do {
            for (int i = 0; i < campo.length; i++) {
                for (int j = 0; j < campo.length; j++) {
     
                    pocisionRandom--;
                    System.out.println("pr"+pocisionRandom);
                    System.out.println("cm"+cantidadMinas);
                    System.out.println("");//todo

                    if (pocisionRandom <= 0 && cantidadMinas>0) {
                        campo[i][j] = 1;
                        cantidadMinas--;
                        i = 0;
                        j = 0;
                        pocisionRandom= (int) ((Math.random()) * (Math.pow(10,(digitosArea + 1))));
                    }

                }

            }
        } while (cantidadMinas > 0);

        this.campo=campo;
    }

    protected void cantidadDigitos(int tamanno) {
        int i = 0;
        int area = (int) Math.pow(tamanno, 1);

        while (area >= 1) {
            area = area / 10;
            i++;
        }

        digitosArea=i;

    }

    public void dibujarCampo() {

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {

                System.out.print(campo[i][j] + "|");
            }
            System.out.println("");
            System.out.println("----------------------------------------");
        }
        

    }
    
}
