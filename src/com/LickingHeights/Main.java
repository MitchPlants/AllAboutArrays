package com.LickingHeights;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 0;
        int highestNumber = 10;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);
        String[] adjectives = {"Silly","tiresome","Lousy","sick"};
        String[] places = {"Costco","Chuck E Cheese","Licking Heights High school","Utah"};
        String[] people = {"Xi Jinping","John Lynch","Felix Kjellberg","Corbin Russ"};
        String[] verbs = {"Lead","Fought","Entertained","Taught"};
        String[] times = {"Evening","Dusk","Noon","Night"};
        String[] things = {"Worm on a String","Ligature","Album","Jersey"};

        printArray(array);
        System.out.println("The sum of the array is " + sum(array));
        System.out.println("The minimum of the array is " + min(array));
        System.out.println("The maximum of the array is " + max(array));
        bubbleSort(array);
        System.out.println("After Bubble Sort");
        printArray(array);
//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();
//        System.out.println(array[0]);
    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void Pattern1() {
        for (int rows = 0; rows < 6; rows++) {
            for (int column = 0; column < 6; column++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void Pattern2() {
        for (int rows = 1; rows < 7; rows++) {
            for (int column = 1; column < 8; column++) {
                System.out.print(rows);
            }
            System.out.println();
        }


    }

    public static void Pattern3() {

        for (int rows = 1; rows < 7; rows++) {
            for (int column = 1; column < 7; column++) {
                System.out.print(column);
            }
            System.out.println();
        }


    }

    public static void Pattern4() {
        for (int rows = 6; rows > 0; rows--) {
            for (int column = rows; column < 7; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern5() {
        for (int rows = 1; rows < 7; rows++) {
            for (int column = 1; column <= rows; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];

        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        return min;


    }

    public static int max(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }

        }
        return min;
    }

    public static int[] bubbleSort(int[] array) {
        int i, j, temp;


        for (i = 0; i < array.length; i++) {
            for (j = i+1; j<array.length; j++) {

                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;


                }

            }
        }
        return array;

    }

}