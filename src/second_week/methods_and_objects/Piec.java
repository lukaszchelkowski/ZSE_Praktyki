package second_week.methods_and_objects;

interface piecPiekacz {
    void pieczenieCiastek();
    void pieczenieChleba();
}

interface piecGrill {
    void grillowanieKurczaka();
}


public class Piec implements piecPiekacz, piecGrill {

    private int czas;
    private int temperatura;

    @Override
    public void pieczenieChleba() {
        czas = 120;
        temperatura = 170;
        wlacz();
    }

    @Override
    public void pieczenieCiastek() {
        czas = 20;
        temperatura = 200;
        wlacz();
    }

    @Override
    public void grillowanieKurczaka() {
        czas = 120;
        temperatura = 220;
        wlacz();
    }

    private void wlacz() {
        System.out.println("Wlaczamy Piec " +
                " ustawiamy temperature na: " + temperatura
                + " stopni,"+
                " i czas trwania na: " + czas + "minut");
    }

    public static void main(String[] args) {
        Piec piec = new Piec();

        piecGrill piecGrill = piec;
        piecPiekacz piecPiekacz = piec;

        piecPiekacz.pieczenieChleba();
        piecPiekacz.pieczenieCiastek();
        piecGrill.grillowanieKurczaka();
    }
}
