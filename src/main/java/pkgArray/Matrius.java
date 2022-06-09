package pkgArray;

import java.util.Random;
import java.util.Scanner;

public class Matrius {
    static Random rnd=new Random();

    public int[][] creaMatriu(int maxF,int maxC){
        int [][]mat=new int[maxF][maxC];

        for(int i=0;i<maxF;i++){
            for(int j=0;j<maxC;j++){
                mat[i][j]=rnd.nextInt(10);
            }
        }
        return mat;
    }

    public void imprimeixMatriu(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }

    //public static void main(String[] args) {
    //    int maxF=10,maxC=10;
    //    int[][] m=creaMatriu(maxF,maxC);
    //    imprimeixMatriu(m);
    //}

    // <editor-fold defaultstate="collapsed" desc="FUNCIONS MATRIUS ...">
    //FUNCIONS
    static public int[][] crea_matriu(int n) {
        int[][] mat = new int[n][n];
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                mat[i][j] = rnd.nextInt(n);
            }
        }
        return mat;
    }

    static public int[] mescla3Vectors(int v1[], int v2[], int v3[]) {
        int max = v1.length + v2.length + v3.length;
        int v[] = new int[max];
        int i;
        int cont = 0;

        for (i = 0; i < v1.length; i++) {
            v[cont] = v1[i];
            cont++;
        }
        for (i = 0; i < v2.length; i++) {
            v[cont] = v2[i];
            cont++;
        }
        for (i = 0; i < v3.length; i++) {
            v[cont] = v3[i];
            cont++;
        }


        return v;
    }

    static public int[] matriuAVector(int m[][]) {
        int max = m.length * m[0].length;
        int v[] = new int[max];
        int i, j;
        int cont = 0;

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[0].length; j++) {
                v[cont] = m[i][j];
                cont++;
            }
        }
        return v;
    }

    static public void imprimeix_matriu(int mat[][]) {
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 10)
                    System.out.print("   " + mat[i][j]);
                else if (mat[i][j] < 100)
                    System.out.print("  " + mat[i][j]);
                else
                    System.out.print(" " + mat[i][j]);
            }
            System.out.print("\n");
        }
    }

    static public void imprimeixMatriuFormatSudoku(int mat[][]) {

        // IMPRIMIM EN FORMAT SUDOKU
        int i, j;
        System.out.print("\n\n\t\t  ** SUDOKU ** \n\n");

        for (i = 0; i < mat.length; i++) {
            if (i % 3 == 0) {
                System.out.print("\n\t\t");
            }
            for (j = 0; j < mat[i].length; j++) {
                if (j % 3 == 0) {
                    System.out.print("  ");
                }
                System.out.print(mat[i][j]);
            }
            System.out.print("\n\t\t");
        }
        System.out.print("\n\n");
    }

}
