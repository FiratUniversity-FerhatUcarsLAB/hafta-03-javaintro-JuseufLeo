public class DonusumTablo {
    public static void main(String[] args) {
        // Mil sabitleri
        int[] milDegerleri = {1, 5, 10, 20, 50};

        // Sabit dönüşüm katsayısı
        double katsayi = 1.609;

        // Başlık
        System.out.println("Mil\t Kilometre");

        // Hesaplama ve yazdırma
        for (int mil : milDegerleri) {
            double km = mil * katsayi;
            System.out.printf("%d\t %.3f%n", mil, km);
        }
    }
}
