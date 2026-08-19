package UltraEmojiCombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;


    public Lutador (String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome (){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float al){
        this.altura = al;
    }

    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float p){
        this.peso = p;
        this.setCategoria();
    }
    public String getCategoria(){
        return this.categoria;
    }
    private void setCategoria(){
        if (this.peso < 52.2){
            this.categoria = "INVÁLIDO";
        } else if (this.peso <= 70.3){
            this.categoria = "LEVE";
        } else if (this.peso < 83.9){
            this.categoria = "MÉDIO";
        } else if (this.peso <= 120.2){
            this.categoria = "PESADO";
        } else {
            this.categoria = "INVÁLIDO";
        }
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int v){
        this.vitorias = v;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int d){
        this.derrotas = d;
    }
    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int e){
        this.empates = e;
    }

    public void apresentar(){
        System.out.println("----------------------------------------");
        System.out.println("IT'SSSSSSS TIME!!");
        System.out.println("Lutador: " + this.nome);
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos.");
        System.out.println("Medindo " + this.getAltura() + "m de altura.");
        System.out.println("Pesando: " + this.getPeso() + "kg.");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());

    }
    public void status() {
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());;
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println();

    }
    public void ganharLuta() {
        setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        setDerrotas(this.getDerrotas() + 1);

    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);

    }
}
