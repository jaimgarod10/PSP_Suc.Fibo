/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaime.hilos.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
/**
 * @param args the command line arguments
 */
// TODO code application logic here
public class Fib extends Thread {

    public int n;

    public Fib(int x) {
        this.n = x;
    }

    public int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            System.out.println("Debes introducir un numero mayor o igual que 1.");
            return -1;
        }
    }

    @Override
    public void run() {
        System.out.println("Comienza la sucesión: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\n" + fibonacci(i));
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Introduzca la variable n para hacer la sucesión de Fibonacci: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            Fib f = new Fib(num);
            f.start();
        } catch (Exception e) {
            System.out.println("usage: java Fib NUMBER");
        }
    }
}
