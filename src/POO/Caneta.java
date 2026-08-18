package POO;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.modelo + " de cor " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Tamanho de ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

     void rabiscar(){
        if (tampada == true){
            System.out.println("ERRO! Não posso rabiscar, caneta tampada!!");
        } else {
            System.out.println("Estou rabiscando! - 10% de carga!");
            carga = carga - 10;
        }
        if (carga <= 0){
            System.out.println("CANETA SEM CARGA!");
        }

    }
    void tampar(){
        this.tampada = true;

    }
    void destampar(){
        this.tampada = false;

    }

}
