package com.company.multiDimensionalArrays;

public class Array3x3 {
    public static void main(String[] args) {
        double[][] array3x3 = {
                {1.0, 1.5, 2.0},
                {1.5, 2.0, 2.5},
                {2.0, 2.5, 3.0},
        };

// second version
//        double[][] tab = new double[3][];
//        double[] line0 = {1.0, 1.5, 2.0};
//        double[] line1 = {1.5, 2.0, 2.5};
//        double[] line2 = {2.0, 2.5, 3.0};
//
//        tab[0] = line0;
//        tab[1] = line1;
//        tab[2] = line2;

//  Suma iloczynów przekątnych tablicy

        double result1 = (array3x3[0][0] * array3x3[1][1] * array3x3[2][2]) + (array3x3[2][0] * array3x3[1][1] * array3x3[0][2]);
        System.out.println("Suma iloczynów przekątnych: " + result1);


//  Iloczyn sum środkowego wiersza i środkowej kolumny tablicy

        double result2 = (array3x3[0][1] + array3x3[1][1] + array3x3[2][1]) * (array3x3[1][0] + array3x3[1][1] + array3x3[1][2]);
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny: " + result2);

//  Suma wszystkich elementów znajdujących się przy krawędzi tablicy

        double result3 = array3x3[0][0] + array3x3[0][1] + array3x3[0][2] + array3x3[1][0] + array3x3[1][2] + array3x3[2][0]+ array3x3[2][1] + array3x3[2][2];
        System.out.println("Suma iloczynów przekątnych: " + result3);

    }
}
