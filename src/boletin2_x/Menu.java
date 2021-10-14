/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam1
 */
public class Menu {

    public static void menu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int o;
        do {
            System.out.printf("------Qué exercicio quiere visualizar?------- \n"
                    + " 1-Área triángulo:  \n"
                    + " 2-Área cadrado:  \n"
                    + " 3-Cambio dollar: \n"
                    + " 4-Operaciones: \n"
                    + " 5-Millas a metros \n"
                    + " 6------SALIR------");
            o = Integer.parseInt(br.readLine());
            
            
            switch (o) {

                case 1:
                    System.out.println("Área triángulo de base 4 e altura 3: " + Metodos.areaTriangulo(o));
                    break;
                case 2:
                    System.out.println("Área cadrado de lado 3: " + Metodos.areaCuadrado(o));
                    break;
                case 3:
                    System.out.println("Cambio dollar a euro: " + Metodos.cambioDollar(o));
                    break;
                case 4:

                    System.out.println(Metodos.operaciones(o));
                    break;

                case 8:
                    System.out.println("Cambio millas a metros: " + Metodos.metroMilla(o));
                    break;

            }

        } while (o <= 5 && o > 0);

    }

}
