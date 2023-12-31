import java.util.Scanner;

public class AdimSayar {

    private int adimSayisi;

    // Constructor
    public AdimSayar() {
        this.adimSayisi = adimSayisi;
    }

    // Adım sayısını kullanıcıdan alma
    public void degerGir() {
        Scanner klavye = new Scanner(System.in);

        try {
            System.out.print("Adım sayısını giriniz: ");
            int adimSayisi = klavye.nextInt();

            // Adım sayısı negatifse istisna oluştur
            if (adimSayisi < 0) {
                throw new IllegalArgumentException("Girilen adım sayısı negatif olamaz.");
            }

            // Adım sayısı negatif değilse atama yap
            this.adimSayisi = adimSayisi;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Hata: Geçersiz bir değer girdiniz. Lütfen bir sayı girin.");
            klavye.nextLine(); // Hatalı girişi temizle
            System.exit(0); // Programı sonlandır
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
            System.exit(0); // Programı sonlandır
        }
    }

    // Bilgileri gösterme
    public void bilgileriGoster() {
        System.out.println("Günlük adım sayınız: " + this.adimSayisi);

        // Yakılan kalori hesaplaması
        double yakilanKalori = this.adimSayisi * 0.05;
        System.out.println("Günlük ortalama yaktığınız kalori miktarı: " + yakilanKalori);
    }
}
