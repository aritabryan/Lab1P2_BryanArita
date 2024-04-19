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

//    public static void BubbleSort(int cont) {
//        for (int i = 0; i < newMatriz.length; i++) {
//            for (int j = 0; j < newMatriz[0].length; j++) {
//                if (MatrizSort[i][j] > MatrizSort[i][j + 1]) {
//                    int MatrizEspejo[][] = new int[i][j];
//                    MatrizSort[i][j] = MatrizSort[i][j + 1];
//                }
//            }
//        }
//        return BubbleSort(MatrizSort);
//    }
    public static void BubbleSort(int[][] matriz) {
        int MatrizSort[][] = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (MatrizSort[i][j] > MatrizSort[i][j + 1]) {
                    int MatrizEspejo[][] = new int[i][j];
                    MatrizSort[i][j] = MatrizSort[i][j + 1];
                    System.out.println("[" + MatrizSort + "] ");
                }
            }
            System.out.println("");
        }
    }

    public static void BubbleSort(int cont) {
        for (int i = 0; i < newMatriz.length; i++) {
            for (int j = 0; j < newMatriz[0].length; j++) {
                if (newMatriz[cont][j]==newMatriz[cont][j+1])
            }
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

    public static void BubbleSortArraylist(ArrayList ArrList) {
        int num = 0;
        for (int i = 0; i < ArrList.size(); i++) {
            if ((int) ArrList.get(i) < (int) ArrList.get(+1)) {

            }
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
//        BubbleSort(newMatriz);
        CalculoMedianas(newMatriz);
        System.out.println("\nCalculo de Medianas:");
        IMPArraylist(ArregloMedianas);
        System.out.println("\n\nMediana de las Medianas");
        MedianaDeLaMediana(ArregloMedianas);
    }

}
