public class Uçgen {
    public static void main(String[] args) {

        // Ucgen  Kenarları
        double a = 3 ;
        double b = 4;
        double c = 5;

        // Yarı çevre
        double s = (a + b + c) / 2;

        // Heron formülü ile alan hesaplama
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Sonucu yazdır
        System.out.println("Üçgenin alanı: " + alan);

    }
}
