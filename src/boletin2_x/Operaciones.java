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
public class Operaciones {

    private float num1;
    private float num2;

    public Operaciones(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float operacionSuma(float suma) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        suma = num1 + num2;

        System.out.println("A suma é: " );

        return suma;

    }

    public float operacionResta(float resta) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        resta = num1 - num2;

        System.out.println("O resultado da resta: " );
        return resta;
    }

    public float operacionProducto(float producto) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        producto = num1 * num2;

        System.out.println("O producto é " );
        return producto;
    }

    public float operacionCociente(float cociente) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cociente = num1 / num2;

        System.out.println("O cociente é: ");

        return cociente;
    }

}
