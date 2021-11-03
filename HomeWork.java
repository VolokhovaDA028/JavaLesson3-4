package ru.geekbrains.New1.Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        //    int[] arr1 = new int[]{1, 0, 1, 0, 1, 1, 1};
        //    printBinaryArray(arr1);

        //    printArraySize100(100);

        //    int[] arr2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //    printArrayByTwo(arr2);

    /*    int [][] arr3 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
        };
        printArray2DForUnit(arr3);      */
        //  lenAndInitialValue(5,25);

        //   int[] arr5 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //   minMax(arr5);

        /* int[] arr6 = new int[10];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print(arr6[i] + " ");
        }
        summArray(arr6); */

        //Написать метод, которому на вход подается одномерный массив
        // и число n (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементы массива на n позиций.
        // Элементы смещаются циклично. Примеры:
        // [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].

        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько позиций сместить массив?");
        int n = scanner.nextInt();
        System.out.println("Масиив будет смещен на " + n + " позиций");

        int[] arr7 = {1, 2, 3, 4, 5, 6, 7};
        int[] b = new int[arr7.length];
        moveElementArray(arr7, n, b);




    }
    public static void moveElementArray ( int[] arr7, int n, int[] b) {
        System.out.print("Исходный массив [ ");
        for (int i = 0; i < arr7.length; ++i) {
            System.out.print(arr7[i] + " ");
        }
        System.out.println("] ");

        System.out.print("Массив со сдвигом на " + n + " элементов [ ");
        for (int i = arr7.length-1; i >= 0; i--) {
            if(i+n >= arr7.length){
                b[i+n-arr7.length] = arr7[i];
            }
            else{
                b[i+n] = arr7[i];
            }
        }
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println("] ");
    }



        public static boolean summArray ( int[] arr6){
            int rightSum = 0;
            int leftSum = 0;
            // Нахожу сумму всех элементов
            for (int i = 0; i < arr6.length; i++) {
                rightSum += arr6[i];
            }
            //Перебираю сумму с начала массива и сравниваю с разницей (правой частью)
            for (int i = 0; i < arr6.length; i++) {
                leftSum += arr6[i];
                if (leftSum == rightSum - leftSum) {
                    System.out.println("true");
                    return true;
                }
            }
            System.out.println("false");
            return false;
        }
        public static void minMax( int[] arr){

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
        public static void lenAndInitialValue(int len, int initialValue){
        int[] arr4 = new int[len];
        for (int i = 0; i < len; i++) {
            arr4[i] = initialValue;
            System.out.print(arr4[i] + " ");
        }
    }
        public static void printArray2DForUnit(int[][] arr) {
        for(int y = 0; y < arr.length; ++y) {
            for(int x = 0, i = arr[y].length; x < arr[y].length; ++x, --i) {
                if (x == y || y == i - 1) {
                    arr[y][x]=1;
                }
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }

    }
        public static void printArrayByTwo(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6){
                arr2[i] = arr2[i] * 2;
            }
            System.out.print(arr2[i] + " ");
        }
    }
        public static void printArraySize100(int size) {
            int[] arr = new int[size];

            for(int i = 0; i < arr.length; ++i) {
                arr[i] = i + 1;
                System.out.print(arr[i] + " ");
            }

        }
        public static void printBinaryArray(int[] arr1) {
            for(int i = 0; i < arr1.length; ++i) {
                if (arr1[i] == 0) {
                    arr1[i] = 1;
                } else if (arr1[i] == 1) {
                    arr1[i] = 0;
                }

                System.out.print(arr1[i] + " ");
            }

            System.out.println();
        }
    }

