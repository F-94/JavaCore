package br.com.maratonajava.introducao.arrays;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;
        dias[1][0] = 26;
        dias[1][1] = 25;
        dias[1][2] = 24;
        dias[2] = new int[]{7, 8, 9};

        for (int[] arrayBase : dias
        ) {
            for (int num : arrayBase
            ) {
                System.out.println(num);
            }
            System.out.println("----------------");
        }
        int[][] arrayInt2 = {{0, 1}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int[] arrayBased : arrayInt2
        ) {
            for (int num2 :
                    arrayBased) {
                System.out.println(num2);

            }
            System.out.println("----------------");
        }
    }
}
