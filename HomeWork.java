package ru.geekbrains.New1.Lesson3;

public class HomeWork {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 0, 1, 0, 1, 1, 1};
        printBinaryArray(arr1);

        printArraySize100(100);
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

