package FromVSCodeJava;

import java.util.Arrays;

public class arrayProblems {
    /*
     * Q1. min and max element from an array
     * Q2. Sorting array
     * Q3. Reverse the array
     */

    public static void main(String[] args) {
        m1();
        // m2();
        // m3();
        // System.out.println(m5());
        // m6();
    }
    // find out min and max element from an array

    // with Stream interface
    public static void m1() {
        int[] a = { 3, 2, 1, 56, 10000, 167 };
        System.out.println("Maximum number from an array is--->" + Arrays.stream(a).max().getAsInt());
        System.out.println("Minimum number from an array is--->" + Arrays.stream(a).min().getAsInt());
        System.out.println("=======");
    }

    // with sort method
    public static void m2() {
        int[] a = { 3, 2, 1, 56, 10000, 167 };
        Arrays.sort(a);
        int min = a[a.length - 1];
        int max = a[0];
        System.out.println("min no." + min);
        System.out.println("max no." + max);
        System.out.println("=======");
    }

    // Sorting an array-->
    public static void m3() {
        int[] a = { 3, 2, 1, 56, 10000, 167 };
        Arrays.sort(a);
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("=======");
    }

    // Reverse the array
    public static void m4() {
        int[] a = { 3, 2, 1, 56, 10000, 167 };
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("=======");
    }

    // Finding second highest number from array
    public static int m5() {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int length = 6;
        int temp = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[length - 2];
    }

    public static void m6() {
        System.out.println("test");
        System.out.println("=======vs code is very lightweight and usfull for almost every language");
    }
}
