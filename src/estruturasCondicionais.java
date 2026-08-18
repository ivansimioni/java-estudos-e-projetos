import java.util.Scanner;
public class estruturasCondicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;
        if (media > 7){
            System.out.println("Sua média foi " + media + ", ALUNO APROVADO!");
        } else if (media >= 6){
            System.out.println("Sua média foi " + media + ", ALUNO DE RECUPERAÇÃO!");
        } else {
            System.out.print("Sua média foi " + media + ", ALUNO REPROVADO!");
        }


    }


}
