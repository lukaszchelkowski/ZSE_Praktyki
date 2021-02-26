package First_week.Statements;

import java.util.Scanner;

public class lekcja_statements {
    /*
    if (warunek){
    zróbcos1;
    zrobcos2;
    zrobcosX;
    }
    else{
    zróbcosXX;
    }
     */
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
//     boolean stan = false;
//     if (stan){
//         System.out.println("Wykonała sie instrukcja IF");
//     }
//     else{
//         System.out.println("Wykonała się instrukcja ELSE");
//     }
//     Scanner skaner = new Scanner(System.in);
//        System.out.println("Podaj swój wiek: ");
//        int wiek = skaner.nextInt();
//        if (wiek >= 18 ){
//            System.out.println("Jesteś pełnoletni");
//        }
//        else{
//            System.out.println("Jesteś Niepełnoletni");
//        }
//        System.out.println("Podaj Liczbę: ");
//        int Liczba = skaner.nextInt();
//
//        if(10 < Liczba && Liczba < 20){
//            System.out.println("Liczba mieści się w zakresie");
//        }
//        else{
//            System.out.println("Liczba NIE mieści się w zakresie");
//        }
//        System.out.println("Podaj liczbę Całkowitą A: ");
//        int a = skaner.nextInt();
//        System.out.println("Podaj liczbe Całkowitą B: ");
//        int b = skaner.nextInt();
//        if(a > b){
//            System.out.println("Liczba A jest większa od B");
//        }
//        if (a < b){
//            System.out.println("Liczba A jest mniejsza od B");
//        }
//        if (a == b){
//            System.out.println("Liczba A jest równa B");
//        }
//        if(a > b){
//            System.out.println("Liczba A jest większa od B");
//        }
//        else{
//            if (a < b){
//                System.out.println("Liczba A jest mniejsza od B");
//            }
//            else{
//                System.out.println("Liczba A jest równa B");
//            }
//
//        }
//        char charA = 'A';
//        char charB = 'B';
//
//        if (charA > charB){
//            System.out.println("charA ma większą wartość od charB");
//        }
//        else{
//            System.out.println("charA ma mniejszą wartość od charB");
//        }
//        String hello = "Hello";
//        String world = "World";
//        if (hello.equals(world)){
//            System.out.println("hello jest równe world");
//        }
//        else{
//            System.out.println("hello nie jest równe world");
//        }
        System.out.println("Podaj swój wybór (1, 2, A, B): ");
        char z = skaner.next().charAt(0);

        switch (z){
            case '1':
                System.out.println("Przypadek 1");
                break;
            case '2':
                System.out.println("Przypadek 2");
                break;
            case 'A':
                System.out.println("Przypadek A");
                break;
            case 'B':
                System.out.println("Przypadek B");
                break;
            default:
                System.out.println("Nie wybrano poprawnej odpowiedzi");
                break;
        }


    }
}
