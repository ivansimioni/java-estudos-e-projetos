package POO;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "BIC";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 90;

        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.modelo = "CROWN";
        c2.ponta = 0.8f;
        c2.tampada = true;
        c2.carga = 70;

        c1.status();
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        c1.status();

    }
}
