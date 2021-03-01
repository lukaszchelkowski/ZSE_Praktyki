package second_week.loops;

public class zadania_petle {
    public static void main(String[] args) {
//        int i;
//        i = 0;
//
//        System.out.println("Pierwsza pętla");
//        for (i = 0; i<=10 ; i++){
//            System.out.println("I to = " + i);
//        }
//        System.out.println("Druga pętla");
//        for (int number1 = 0, number2 =9; number1 <= 9; number1++, number2--){
//            System.out.println("Number1: " + number1 + " " + "Number2: "+ number2);
//        }
        System.out.println("trzecia Pętla");
        int x = 0;
        int y = 0;

//        while (x !=10){
//            x++;
//            System.out.println(x);
//        }
//        while (x < 20){
//            x+=2;
//            y = y+2;
//            System.out.println(x + " "+ y);
//        }
//        int numberC = 6;
//        do {
//            System.out.println("zmienna = " + numberC);
//            numberC++;
//        }while(numberC < 12);
        System.out.println("Tabliczka Mnożenia");

        for (int i = 1; i < 11; i++){
            System.out.println(i + " przejście pętli");
            for(int j = 1; j < 11; j++){
                System.out.println("[i:"+ i + "]"+"[j:"+ j +"]\t" + i +" * " + j + " = " + i * j +"\t");
            }
        }



    }
}
