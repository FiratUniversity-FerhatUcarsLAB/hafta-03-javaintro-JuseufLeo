public class CarpimTablo {
    public static void main(String[] args) {
        int sayi = 2;

        System.out.println("2'nin Çarpım Tablosu (1'den 10'a kadar):");
        for (int i = 1; i <= 10; i++) {
            int sonuc = sayi * i;
            System.out.println(sayi + " x " + i + " = " + sonuc);
        }
    }
}
