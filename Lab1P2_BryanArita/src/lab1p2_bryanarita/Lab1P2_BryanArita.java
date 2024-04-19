package lab1p2_bryanarita;

import java.util.Random;
import java.util.Scanner;

public class Lab1P2_BryanArita {

    static Random rndm = new Random();
    static Scanner duki = new Scanner(System.in);

    public static int[][] MatrizGenerada(int fila, int columna) {
        int temp[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                temp[i][j] = rndm.nextInt(10);
            }
        }
        return temp;
    }

    public static void MatrizImpresa(int matriz[][]) {
        int[][] temp = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + temp[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.print("Ingrese tamano de la matriz: ");
        int tamano = duki.nextInt();
        while (tamano <= 4 || tamano % 2 == 0) {
            System.out.println("tamano mayor a 4 y tiene q ser impar!!");
            System.out.print("Ingrese tamano de la matriz: ");
            tamano = duki.nextInt();
        }
        int newMatriz[][] = MatrizGenerada(tamano, tamano);
        MatrizImpresa(newMatriz);

    }

}
