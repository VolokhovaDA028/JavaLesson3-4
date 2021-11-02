package ru.geekbrains.New1.Lesson3;

import java.util.Random;

public class MyArray {
    public static void printArray(int[] arr) {
        System.out.print("[ ");

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("] ");
    }

    public static void printArray(double... arr) {
        System.out.print("[ ");

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("] ");
    }

    public static void printArray(int[][] arr) {
        for(int y = 0; y < arr.length; ++y) {
            for(int x = 0; x < arr[y].length; ++x) {
                System.out.print(arr[y][x] + " ");
            }

            System.out.println();
        }

    }

    public static int[] makeArrayWithRandomValues(int length) {
        int[] arr = new int[length];
        Random random = new Random();

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = random.nextInt();
        }

        return arr;
    }


    }
