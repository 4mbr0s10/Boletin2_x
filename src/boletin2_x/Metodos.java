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
public class Metodos {

    public static float areaTriangulo(float area) {
        float base = 4f;
        float altura = 3f;

        area = base * altura / 2;

        return area;

    }

    public static float areaCuadrado(float area) {
        float lado = 3f;
        area = (float) Math.pow(lado, 2);

        return area;
    }

    public static float cambioDollar(float cambio) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca o valor do Dollar con respecto ó euro: ");
        float dollar = Float.parseFloat(br.readLine());
        System.out.println("Introduzca a cantidade de euros que desexa cambiar: ");
        float euros = Float.parseFloat(br.readLine());
        cambio = euros * dollar;
        System.out.println("O cambio queda en: " + cambio);

        return cambio;
    }

    public static float operaciones(float resultado) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Operaciones op = new Operaciones(0, 0);
        System.out.println("Introduzca un número: ");
        op.setNum1(Float.parseFloat(br.readLine()));
        System.out.println("Introduzca otro número: ");
        op.setNum2(Float.parseFloat(br.readLine()));
        System.out.println(op.operacionSuma(resultado));
        System.out.println(op.operacionResta(resultado));
        System.out.println(op.operacionProducto(resultado));
        System.out.println(op.operacionCociente(resultado));
        return resultado;

    }

// 
    public static long metroMilla(long conversion) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long metro = 1852;
        System.out.println("Introduzca o número de millas que queres convertir: ");
        long millas = Long.parseLong(br.readLine());
        conversion = millas * metro;
        System.out.println("O total en metros é: " + conversion);

        return conversion;
    }

}
