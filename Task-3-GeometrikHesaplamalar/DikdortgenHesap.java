public class Dikdörtgen {
    public static void main(String[] args) {

        // Dikdörgenin boyutları
        double en = 4.5;
        double boy = 7.9;

        // Alan hesaplama: en * boy
        double alan = en * boy;

        // Çevre hesaplama: 2 * ( en + boy )
        double cevre =  2 * (boy + en);

        // Sonuçlari yazdir
        System.out.println("Dikdörtgenin alanı" + alan);
        System.out.println("Dikdörtgenin Çevresi" + cevre );

    }
}
