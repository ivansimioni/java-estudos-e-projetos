package POO3;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    private int carga;

    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        this.carga = 100;
}


    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public void status(){
        System.out.println("Uma caneta " + this.modelo + " de cor " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Tamanho de ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    public void escrever() {
        if (carga >0) {
            System.out.println("ESCREVENDO ...ASDASDASDASDASD...");
            carga = carga - 10;
        }
        else if (carga <= 0) {
            System.out.println("A tinta acabou!!!");
        }
    }
}
