/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

/**
 *
 * @author u1845853
 */
public class Soma {
//    public int somar(int num1, int num2) {
//        return num1 + num2;
//    }
//    public int somar(int num1, int num2, int num3) {
//        return num1 + num2 + num3;
//    }

    public int somar(int... numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        Soma soma = new Soma();
        int resp = soma.somar(5, 8, 8,  32,23,6,78, 12,  21, 57,6);
        System.out.println("soma :" + resp);
    }
}
