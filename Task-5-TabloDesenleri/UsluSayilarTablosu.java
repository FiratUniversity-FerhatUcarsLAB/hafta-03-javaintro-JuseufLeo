public class UsluSayi {
    public static void main(String[] args) {

        System.out.println("a\t a^2\t a^3\t ");

        for (int a = 1; a <= 5; a++) {
            int kare = (int)Math.pow(a, 2);
            int kup = (int) Math.pow(a, 3);
            System.out.println(a + "\t " + kare + "\t " + kup);

        }
    }
}
