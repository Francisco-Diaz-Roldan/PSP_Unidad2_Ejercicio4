package org.example;

public class Fibonaci {
        private int n;
        private final int[][] valores;

        public Fibonaci(int n) {
            this.n = n;
            this.valores = new int[n][1];
        }

        public void calcularFibonaci() {
            for (int i = 0; i < n; i++) {
                Thread hilo = new Hebra(i, valores);
                hilo.start();
                try {
                    hilo.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public void resultado() {
            for (int i = 0; i < n; i++) {
                System.out.println("Hilo " + i + ": " + valores[i][0]);
            }
        }

}
