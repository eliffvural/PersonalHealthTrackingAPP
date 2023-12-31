import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        // kullanici bilgilerini alma
        System.out.println("Kullanıcı bilgilerinizi giriniz:");
        System.out.print("Adınız: ");
        String ad = klavye.nextLine();

        System.out.print("Soyadınız: ");
        String soyad = klavye.nextLine();

        System.out.print("E-mail adresiniz: ");
        String email = klavye.nextLine();

        System.out.print("Yaşınız: ");
        int yas = klavye.nextInt();

        // kullanici nesnesini olusturma
        Kullanici kullanici = new Kullanici(ad, soyad, email, yas);

        // kullanici bilgilerini ekrana yazdirma metodu
        kullanici.bilgileriGoster();

        // olcum yonetimi secimi yapma
        System.out.println("\nYaptırmak istediğiniz işlemi seçiniz:");
        System.out.println("Kan basıncı ölçümü için 1'i,");
        System.out.println("Kilo ölçümü için 2'yi,");
        System.out.println("Uyku takibi ölçümü için 3'ü,");
        System.out.println("Adım sayınızın takibi için 4'ü seçiniz.");

        int secim = klavye.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Kan basıncı ölçümü");
                Olcum.KanBasinci kanBasinci = new Olcum.KanBasinci();
                kanBasinci.degerGir();
                kanBasinci.olcumBilgileriniAl();
                System.out.println("Ölçüm değeri: " + kanBasinci.degerToString());
                kanBasinci.sistolikDurum();
                System.out.println("");
                kanBasinci.diastolikDurum();

                break;

            case 2:
                System.out.println("Kilo ölçümü");
                Olcum.Kilo kilo = new Olcum.Kilo();
                kilo.degerGir();
                kilo.olcumBilgileriniAl();
                System.out.println("ölçüm değeri: " + kilo.degerToString());



                break;

            case 3:
                System.out.println("Uyku takibi ölçümü");
                UykuTakibi uykuTakibi = new UykuTakibi();
                uykuTakibi.uykuVerisiGir();
                uykuTakibi.uykuSuresiGoster();
                uykuTakibi.uykuKalitesiGoster();
                break;

            case 4:
                System.out.println("Adım sayısı ölçümü");
                AdimSayar adimSayar = new AdimSayar();
                adimSayar.degerGir();
                adimSayar.bilgileriGoster();
                break;

            default:
                System.out.println("Geçersiz seçim yaptınız.");
                break;
        }
    }
}
