package ru.geekbrains.New1.Lesson3;

import java.util.*;

public class ClassWork {

        public static void main(String[] args) {
            // linearArr();
            // arrays2D();
            // arrayUtils();
            // randomExample();
            // castExample();
            // simpleScannerExample()


        }

        private static void simpleScannerExample() {
            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("--");
            String s = scanner.next();
            System.out.println(s);
            int a = scanner.nextInt();
            System.out.println(a);
            scanner.useLocale(Locale.UK);
            double d = scanner.nextDouble();
            System.out.println(d);
        }

        private static void castExample() {
            //НЕ явное приведение типов
            byte b = 120;
            short s = b;
            int i = s;
            //long l = i;
            long l = 160;

            b = (byte) l; //явное приведение типов

            System.out.println(b);
        }

        private static void randomExample() {
            int[] arr = MyArray.makeArrayWithRandomValues(15);
            MyArray.printArray(arr);
//рандомное число
            Random rand = new Random();
            // int q = rand.nextInt(100);
            // int q = rand.nextInt(1001) + 1000;
            int q = rand.nextInt(200) - 100;
            System.out.println(q);

            double doubleVar = rand.nextDouble();
            System.out.println(doubleVar);

            int intFromDouble = (int) (doubleVar * 100);
            System.out.println(intFromDouble);
            Math.random();
        }

        private static void arrayUtils() {
            String[] arr = {
                    "Ji",
                    "Far",
                    "Maby",
                    "Asedcv"
            };
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            //Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
            Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }
            });
            System.out.println(Arrays.toString(arr));
        }

        private static void arrays2D() {
            int[][] arr = new int[3][];
            arr[0] = new int[3]; //не регулярный массив
            arr[1] = new int[30];
            arr[2] = new int[10];

            arr[1][15] = 99; //обращение к элементу двумерного массива
            MyArray.printArray(arr);
            System.out.println();

            int[][] arr2 = {
                    {1, 2, 3},
                    {3, 4, 5, 7},
                    {5, 6, 7}
            };
            MyArray.printArray(arr2);

            System.out.println(Arrays.deepToString(arr));
            //Arrays.asList()
            //Arrays.binarySearch()
            //Arrays.compare() - сравнене массивов
            //Arrays.deepEquals() - сравнение массивов на одинаковость
            //Arrays.fill() - заполнить массив одним значением
        }

        private static void linearArr() {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            MyArray.printArray(arr);

            double[] arr1 = {1, 2, 3, 4, 5, 6, 7};
            MyArray.printArray(arr1);
            MyArray.printArray();
            MyArray.printArray(1.0, 2.0);
        }
    }
