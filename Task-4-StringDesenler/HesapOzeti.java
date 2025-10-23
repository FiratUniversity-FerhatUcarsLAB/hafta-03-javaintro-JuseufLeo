public class HesapOzeti {
    public static void main(String[] args) {
        // Alışveriş Listesi Verileri
        String[] urunler = {"Ekmek", "Süt", "Yumurta", "Peynir", "Elma"};
        int[] miktarlar = {2, 1, 10, 500, 3}; // Ekmek (adet), Süt (litre), Yumurta (adet), Peynir (gram), Elma (kg)
        double[] fiyatlar = {7.50, 24.99, 45.00, 85.50, 15.90};

        // Toplam tutarı hesaplamak için değişken
        double toplamTutar = 0.0;

        // 1. Başlık Satırını Yazdırma
        System.out.println("====================================================");
        // %-20s: 20 karakter sola hizalı metin (Ürün)
        // %-10s: 10 karakter sola hizalı metin (Miktar)
        // %-10s: 10 karakter sola hizalı metin (Birim Fiyatı)
        System.out.printf("| %-20s | %-10s | %-15s |\n", "Ürün", "Miktar", "Birim Fiyatı (TL)");
        System.out.println("====================================================");

        // 2. Liste Öğelerini Döngü ile Yazdırma
        for (int i = 0; i < urunler.length; i++) {

            // Not: Farklı ürünler için miktar sütununda gösterilecek birimleri ekleyebiliriz (örneğin "1 L", "500 gr" vb.)
            String miktarMetni;
            if (urunler[i].equals("Süt")) {
                miktarMetni = miktarlar[i] + " L";
            } else if (urunler[i].equals("Peynir")) {
                miktarMetni = miktarlar[i] + " gr";
            } else if (urunler[i].equals("Elma")) {
                miktarMetni = miktarlar[i] + " kg";
            } else {
                miktarMetni = miktarlar[i] + " adet";
            }

            // %-20s: Ürün Adı (Sola Hizalı)
            // %-10s: Miktar (Birimle beraber Sola Hizalı)
            // %15.2f: Birim Fiyatı (15 karakter genişliğinde, 2 ondalık basamaklı, Sağa Hizalı)
            System.out.printf("| %-20s | %-10s | %15.2f |\n", urunler[i], miktarMetni, fiyatlar[i]);

            // Toplam tutarı hesaplama (Basitlik için miktar * fiyat yerine sadece fiyatları topluyoruz.
            // Eğer isterseniz çarpımını da ekleyebilirsiniz: toplamTutar += miktarlar[i] * fiyatlar[i]; )
            toplamTutar += fiyatlar[i];
        }

        // 3. Alt Çizgi ve Toplam Tutar
        System.out.println("====================================================");

        // %-33s: İlk iki sütunu kaplayacak kadar boşluk
        // %15.2f: Toplam Tutar (Sağa Hizalı)
        System.out.printf("| %-33s | %15.2f |\n", "TOPLAM TUTAR:", toplamTutar);
        System.out.println("====================================================");
    }
}
