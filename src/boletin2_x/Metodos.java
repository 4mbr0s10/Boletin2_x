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

    public static float operacionSuma(float suma) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca o primeiro número: ");
        float num1 = Float.parseFloat(br.readLine());
        System.out.println("Introduzca o segundo número: ");
        float num2 = Float.parseFloat(br.readLine());
        suma = num1 + num2;

        System.out.println("A suma é: " + suma);

        return suma;

    }

    public static float operacionResta(float resta) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca o primeiro número: ");
        float num1 = Float.parseFloat(br.readLine());
        System.out.println("Introduzca o segundo número: ");
        float num2 = Float.parseFloat(br.readLine());
        resta = num1 - num2;
        

        System.out.println("O resultado da resta: " + resta);

        return resta;

    }

    public static float operacionProducto(float producto) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca o primeiro número: ");
        float num1 = Float.parseFloat(br.readLine());
        System.out.println("Introduzca o segundo número: ");
        float num2 = Float.parseFloat(br.readLine());
        producto = num1*num2;

        System.out.println("O producto é " + producto);

        return producto;

    }

    public static float operacionCociente(float cociente) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca o primeiro número: ");
        float num1 = Float.parseFloat(br.readLine());
        System.out.println("Introduzca o segundo número: ");
        float num2 = Float.parseFloat(br.readLine());
        cociente = num1/num2;

        System.out.println("O cociente é: " + cociente);

        return cociente;

    }
    public static long metroMilla(long conversion)throws IOException{
         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            long metro=1852;
            System.out.println("Introduzca o número de millas que queres convertir: ");
            long millas=Long.parseLong(br.readLine());
            conversion= millas*metro;
            System.out.println("O total en metros é: "+conversion);
        
        
       return conversion; 
    }
            
}
