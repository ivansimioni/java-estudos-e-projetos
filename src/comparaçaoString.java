public class comparaçaoString {
    public static void main(String[] args) {
        String nome1 = "Ivan";
        String nome2 = "Ivan";
        String nome3 = new String("Ivan");
        boolean res;
        //String res;
        //res = (nome1 == nome2)?"igual":"diferente";
        res = (nome1.equals(nome3));
        System.out.println(res);
    }
}
