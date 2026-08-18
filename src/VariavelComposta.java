public class VariavelComposta {
    public static void main(String[] args) {
        int n[] = new int[4];
        n[0] = 3;
        n[1] = 5;
        n[2] = 8;
        n[3] = 2;
        System.out.println("O total de intens em N é: " + n.length);
        // ou
        // int n[] = {3, 5, 8, 2};
        for (int c = 0; c < n.length; c++){
            System.out.println(n[c]);
        }
    }
}
