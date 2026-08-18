package POO3;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "AZUL", 0.8f);
        c1.status();
        Caneta c2 = new Caneta("CROWN", "PRETA", 1.0f);
        c2.status();
        c1.escrever();
        c1.status();

    }
}
