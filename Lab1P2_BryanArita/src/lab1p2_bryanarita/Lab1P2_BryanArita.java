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

//    public static int[][] BubbleSort(int[][] matriz) {
//        int MatrizSort[][] = new int[matriz.length][matriz[0].length];
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[0].length; j++) {
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
    
     public static void CalculoMedianas(int matriz[][]) {
        for (int i = 0; i < newMatriz.length; i++) {
            for (int j = 0; j < newMatriz.length; j++) {
                if (j == ((newMatriz.length - 1) / 2)) {
                    ArregloMedianas.add(newMatriz[i][j]);
                }
            }
        }
        System.out.println(ArregloMedianas);
    }
     
     public static void ArrayListOrdenado (ArrayList ArrList){
         for
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

         newMatriz= MatrizGenerada(tamano, tamano);
//        BubbleSort(newMatriz);
        System.out.println("IDea: ");
        CalculoMedianas(newMatriz);
    }

}
