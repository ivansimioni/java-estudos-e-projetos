public class VariavelCompostaB {
    public static void main(String[] args) {
        String mes[] = {"JAN","FEV","MAR","ABR","MAI","JUN","JUL","AGO","SET","OUT","NOV","DEZ"};
        String dia[] = {"31","28","31","30","31","30","31","31","30","31","30","31"};
        for (int i = 0; i < mes.length; i++){
            System.out.println("O mês " + mes[i] + " tem " + dia[i] + " dias.");
        }
    }
}
