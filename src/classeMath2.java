import java.util.Scanner;
public class classeMath2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número entre 5 e 10:" );
        double num = sc.nextInt();
        double ale = 5 + Math.random() * (10 - 5);
        if (num == ale) {
            System.out.println("Parabéns, acertou o número: " + ale);
        } else {
            System.out.println("ERROU!! O número certo foi: " + ale + " e não " + num);
        }
    }
}
