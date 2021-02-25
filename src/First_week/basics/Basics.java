package First_week.basics;

public class Basics {
    public static void main(String[] args) {
        //liczby całkowite
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;
        //dodawanie zmiennych
        int sum = myIntA + myIntB + myIntC;
        System.out.println("dodawanie wynik: "+ sum);

        //Odejmowanie zmiennych
        sum = myIntA - myIntB - myIntC;
        System.out.println("Odejmowanie wynik: " + sum);

        //Mnożenie zmiennych
        sum = myIntA * myIntB * myIntC;
        System.out.println("Mnożenie wynik= "+ sum);

        //Dzielenie zmiennych
        sum = myIntB / 2;
        System.out.println("Dzielenie B przez 2 =" + sum);

        sum = myIntC / 2;
        System.out.println("dzielenie C przez 2= "+ sum);

        //float/double
        double myDoubleA = 1.65;
        double myDoubleB = 1.44;

        double sumDouble;
        sumDouble = myDoubleA + myDoubleB;

        System.out.println(sumDouble);

        // znaki ( characters )

        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';

        System.out.println("Moja ulubiona literka to: " + myCharA);
        System.out.println("Moj  ulubiony znak to: " + myCharC);

        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Suma znaków to : " + sumChar);

        // string ciagi znakow słlowa i wyrazy
        String myStringA = "Lukasz";
        String myStringB = "Lubi";
        String myStringC = "Pomidorową";
        System.out.println(myStringA + myStringB + myStringC);

        // boolean
        boolean myBoolean = true;

        System.out.println(!myBoolean);


    }

}
