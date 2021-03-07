package second_week.methods_and_objects;

import java.util.Scanner;

public class metody_lekcja {

    static int addNumbers(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }
    static String getName(){
        return "Wojtek";
    }
    static void printSomething(){
        System.out.println(("\nSomething"));
    }
    static void printSomethingIfNumberisBig(int Number){
        if (Number < 10){
            return;
        }
        System.out.println("Something wypluwa sie bo liczba liczba była od 10");
    }

    public static void main(String[] args) {
        System.out.println("Wywołanie metody dodawania");

        int suma = addNumbers(5,6,2);

        System.out.println("Wynik to: "+ suma);

        System.out.println("Przykładowe imię: "+ getName());

        printSomething();

        printSomethingIfNumberisBig(12);

        Scanner skaner = new Scanner(System.in);

        int liczba = 0;

        System.out.println("Podaj przykładowa liczbę od 0 do 100");
    }
}