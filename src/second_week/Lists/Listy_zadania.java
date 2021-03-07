package second_week.Lists;

import java.util.ArrayList;
import java.util.Collections;

public class Listy_zadania {
    public static void main(String[] args) {
        System.out.println("Zadanie 3 - Listy");
        ArrayList<String> lista_samochodow = new ArrayList<>();
        lista_samochodow.add("BMW");
        lista_samochodow.add("Mercedes-Benz");
        lista_samochodow.add("Bentley");
        lista_samochodow.add("Porsche");
        System.out.println(lista_samochodow);

        //Dodawanie
        lista_samochodow.add("Fiat");
        lista_samochodow.add(1,"Lamborghini");
        System.out.println("\n" + lista_samochodow);

        //Odejmowanie
        lista_samochodow.remove("Porsche");
        lista_samochodow.remove(0);
        System.out.println("\n" + lista_samochodow);

        //Nadpisywanie
        lista_samochodow.set(3,"Opel");
        System.out.println("\n" + lista_samochodow);

        //Sortowanie
        Collections.sort(lista_samochodow);
        System.out.println("\n" + lista_samochodow);

        //Czyszczenie
        lista_samochodow.clear();
        System.out.println("\n" + lista_samochodow);
    }
}
