package org.example;

public class Hebra extends Thread{
    private final int hebra;
    private final int[][] valores;

    public Hebra(int hebra, int[][] valores) {
        this.hebra = hebra;
        this.valores = valores;
    }

    private int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    public void run() {
        valores[hebra][0] = calcularFibonacci(hebra);
    }
}
