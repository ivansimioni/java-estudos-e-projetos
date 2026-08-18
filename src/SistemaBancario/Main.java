package SistemaBancario;

public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(1, 'P', "Ivan Simioni");
        c1.abrirConta();
        c1.status();
        ContaBanco c2 = new ContaBanco(2, 'C', "Milena Pinheiro");
        c2.abrirConta();
        c1.sacar(150);
        c1.fecharConta();



    }
}