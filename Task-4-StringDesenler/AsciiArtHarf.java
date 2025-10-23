public class ASII {
    public static void main(String[] args) {
        int height = 9; // Y harfinin yüksekliği (tek sayı önerilir)

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {

                // Üst kısım: iki yandan gelen kollar
                if (i < height / 2) {
                    if (j == i || j == height - 1 - i) {
                        System.out.print("Y");
                    } else {
                        System.out.print(" ");
                    }

                    // Alt kısım: ortadan düz çizgi
                } else {
                    if (j == height / 2) {
                        System.out.print("Y");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
