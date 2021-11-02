package ru.geekbrains.New1.Lesson3;

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

        lenAndInitialValue(5,25);


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

