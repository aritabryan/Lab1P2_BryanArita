package lab1p2_bryanarita;
//Fila 1 Asiento 9

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab1P2_BryanArita {

    static Random rndm = new Random();
    static Scanner duki = new Scanner(System.in);
    static ArrayList<Integer> ArregloMedianas = new ArrayList<Integer>();

    public static int[][] MatrizGenerada(int fila, int columna) {
        int temp[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                temp[i][j] = rndm.nextInt(10);
                System.out.print("[" + temp[i][j] + "] ");
            }
            System.out.println("");
        }
        return temp;
    }

    public static void BubbleSort2(int[] arreglo, int cont) {
        int espejo = 0;
        int espejo2 = 0;
        for (int i = 0; i < newMatriz.length - 1; i++) {
            for (int j = 0; j < newMatriz[0].length - 1; j++) {

            }
        }

    }

    public static void BubbleSort(int[][] matriz, int cont) {
        int espejo = 0;
        int espejo2 = 0;
        for (int i = 0; i < newMatriz.length - 1; i++) {
            for (int j = 0; j < newMatriz[0].length - 1; j++) {
                if (newMatriz[cont][j] == newMatriz[cont][j + 1]) {
                    espejo = newMatriz[cont][j];
                    espejo2 = newMatriz[cont][j + 1];
                    newMatriz[cont][j + 1] = espejo;
                    newMatriz[cont][j + 1] = espejo2;
                }
            }
        }
        BubbleSort(newMatriz, cont + 1);
    }

    public static void ImprimirBubble(int[][] matriz) {
        int temp[][] = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + temp[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void CalculoMedianas(int matriz[][]) {
        for (int i = 0; i < newMatriz.length; i++) {
            for (int j = 0; j < newMatriz.length; j++) {
                if (j == ((newMatriz.length - 1) / 2)) {
                    ArregloMedianas.add(newMatriz[i][j]);
                }
            }
        }
    }

    public static void IMPArraylist(ArrayList arrayL) {
        for (int i = 0; i < arrayL.size(); i++) {
            System.out.print("[" + arrayL.get(i) + "] ");
        }
    }

    public static void BubbleSortArraylist(ArrayList<Integer> ArrList, int cont) {
        int espejo = 0;
        int espejo2 = 0;
        if (cont < ArrList.size()) {
            for (int i = 0; i < ArrList.size() - 1; i++) {
                if (ArrList.get(i) > ArrList.get(i + 1)) {
                    espejo = ArrList.get(i);
                    espejo2 = ArrList.get(i + 1);
                    espejo = ArrList.set(i, espejo2);
                    espejo2 = ArrList.set(i, espejo);
                }
            }
            BubbleSortArraylist(ArrList, cont + 1);
        }
    }

    public static void MedianaDeLaMediana(ArrayList arrayL) {
        for (int i = 0; i < arrayL.size(); i++) {
            if (i == (arrayL.size() - 1) / 2) {
                System.out.println("[" + arrayL.get(i) + "]");
            }
        }
    }

    static int newMatriz[][]; //variable global para hacer mas facil el uso de los metodos

    public static void main(String[] args) {
        System.out.print("Ingrese tamano de la matriz: ");
        int tamano = duki.nextInt();
        while (tamano <= 4 || tamano % 2 == 0) {
            System.out.println("tamano mayor a 4 y tiene q ser impar!!");
            System.out.print("Ingrese tamano de la matriz: ");
            tamano = duki.nextInt();
        }

        System.out.println("\nMatriz generada:");
        newMatriz = MatrizGenerada(tamano, tamano);
        System.out.println("\nMatriz Ordenada:");
        BubbleSort(newMatriz, 0);
        CalculoMedianas(newMatriz);
        System.out.println("\nCalculo de Medianas:");
        IMPArraylist(ArregloMedianas);
        System.out.println("\nArreglo de Medianas Calculados: ");
        BubbleSortArraylist(ArregloMedianas, 0);
        System.out.println("\n\nMediana de las Medianas");
        MedianaDeLaMediana(ArregloMedianas);
    }

}
