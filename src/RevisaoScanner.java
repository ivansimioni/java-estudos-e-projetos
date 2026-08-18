import java.util.Scanner;
public class RevisaoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua nota: ");
        float nota = sc.nextFloat();
        System.out.printf("A nota do %s é %.1f", nome, nota);
    }
}
