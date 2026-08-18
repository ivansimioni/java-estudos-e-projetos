import java.util.Scanner;
public class operadorTernário {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();
        /*if (n1 > n2){
            maior = n1;
            System.out.println("O maior número é: " + maior + ", o primeiro número.");
        } else if (n2 > n1){
            maior = n2;
            System.out.println("O maior número é: " + maior + ", o segundo número.");
        } else {
            System.out.println("Os números são iguais.");*/
        int maior = (n1>n2)?n1:n2;
        System.out.println("O maior número é: " + maior);
        }

    }

