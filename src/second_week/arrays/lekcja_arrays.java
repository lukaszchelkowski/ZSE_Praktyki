package second_week.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class lekcja_arrays {
    public static void main(String[] args) {
//        int[] array = {1,45,56, -23};
//        int array2 []= {-7,6,52,3,100,0,777 };
//        System.out.println("Element pierwszy tablicy array[0] "+ array[0]);
//        System.out.println("Dlugość tablicy array: " + array.length);
//        System.out.println("Element pierwszy tablicy array2[0]: "+ array2[0]);
//        System.out.println("Długość tablicy array2: "+ array2.length);
//
//        System.out.println("\n\nTablice array przed zmianą: "+ Arrays.toString(array));
//
//        array[0] = 15;
//        array[1] = 10;
//        array[2] = 5;
//        array[3] = 0;
//
//        System.out.println("Tablice array po zmianie:" + Arrays.toString(array));

        Integer[] intArray = {6,1,5,2,0,10,4,3,7,9};
        Arrays.sort(intArray);
        System.out.println("sortowanie w porządku rosnącym: "+ Arrays.toString(intArray));

        //sortowanie w porządku malejącym
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("sortowanie w porządku malejącym: "+ Arrays.toString(intArray));

        Random rand = new Random();

        int rand_int1 = rand.nextInt(10);
        System.out.println("Wartosc rand_int1: "+ rand_int1);

        int rand_int2 = rand.nextInt(10) + 1;
        System.out.println("Wartość rand_int2: " + rand_int2);

        double rand_double1 = rand.nextDouble();
        System.out.println("Wartość rand_dounle1: " + rand_double1);
        




        }

    }

