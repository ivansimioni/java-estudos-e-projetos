package POO2;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Uma caneta " + this.modelo + " de cor " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Tamanho de ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public void rabiscar(){
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
    public void tampar(){
        this.tampada = true;

    }
    public void destampar(){
        this.tampada = false;

    }

}