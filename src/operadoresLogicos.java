import java.util.Scanner;
public class operadoresLogicos {
    public static void main(String[] args) {
        /*int a, b, c;
        a = 2;
        b = 6;
        c = 12;
        boolean r;
        r = (a<b && b<c)?true:false;
        System.out.print(r);
        r = (a<b || c<a)?true:false;
        System.out.println(r);
        r = (a>b ^ c>a)?true:false;
        System.out.println(r);*/
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite sua idade e veja informações sobre voto: ");
        int idade = sc.nextInt();
        ///String sit = (idade < 16? "NÃO VOTA" : (idade >= 16 && idade < 18 || idade >= 70)?"VOTO OPCIONAL":"VOTO OBRIGATÓRIO");
        ///System.out.print(sit);
        if (idade>=18 && idade < 70){
            System.out.print("VOTO OBRIGATÓRIO");
        } else if (idade >=16 && idade <18 || idade >= 70){
            System.out.print("VOTO OPCIONAL");
        } else{
            System.out.print("NÃO VOTA");
        }


    }
}
