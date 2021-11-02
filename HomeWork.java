package ru.geekbrains.New1.Lesson3;

public class HomeWork {

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 1, 1, 1};
        printArray(arr1);
    }

    public static void printArray(int[] arr1){
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else if (arr1[i] == 1){
                arr1[i] =0;
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println("] ");
    }
}
