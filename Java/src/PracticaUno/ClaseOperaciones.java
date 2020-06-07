package PracticaUno;

import java.util.Random;
import java.util.Scanner;

public class ClaseOperaciones {
    private Scanner _entrada;

    public void setEntrada() {
        _entrada = new Scanner(System.in);
        //String entrada;
        short[][] irregular;
        irregular = new short[3][];
        irregular[0] = new short[2];
        irregular[1] = new short[4];
        irregular[2] = new short[3];
        Random x = new Random();


        for (short[] fila:irregular
             ) {
            for (int i = 0; i < fila.length; i++) {
                fila[i] = (short) x.nextInt(255);
            }
        }
        mostrarMatriz(irregular);

    }

    private void mostrarMatriz(short[][] m1) {
        for (short[] fila:m1
        ) {
            for (int i = 0; i < fila.length; i++) {
                System.out.printf("%-5d",fila[i]);
            }
            System.out.println();
        }
    }


    //Retornara falso si la comprobacion no ha tenido ningun problema.
    public boolean tryPanaConprobacion(String num){
        try {
            float valor = Float.parseFloat(num);
            return false;
        }catch (Exception e){
            return true; //Retornara verdadero si surge algun error.
        }
    }
}
