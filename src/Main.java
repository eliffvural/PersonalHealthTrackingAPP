
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       // Olcum kanBasinci= new Olcum.KanBasinci("12.10.2023");
       // Olcum kilo=new Olcum.Kilo("13.10.2023");
        //  AdimSayar adimSayar= new AdimSayar();
        //UykuTakibi uykuTakibi= new UykuTakibi();

      /*

      UykuTakibi uykuTakibi = new UykuTakibi();

        try {
            uykuTakibi.uykuVerisiGir();
            uykuTakibi.uykuVerisiGir();
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        */

        Scanner klavye = new Scanner(System.in);
        System.out.println("Kullanıcı bilgilerinizi giriniz:");

        System.out.print("Ad: ");
        String ad = klavye.nextLine();

        System.out.print("Soyad: ");
        String soyad = klavye.nextLine();

        System.out.print("E-mail: ");
        String email = klavye.nextLine();

        System.out.print("Yaş: ");
        int yas = klavye.nextInt();




        System.out.println("");


        // kullanici nesnesi olusturma
        Kullanici kullanici = new Kullanici(ad, soyad, email, yas );

        // kullanici bilgilerini ekrana yazdirma
        kullanici.bilgileriGoster();

        //switch case ile olcum yontemi secimi yapilacak.
        System.out.println("");

        System.out.println("Yaptırmak istediğiniz işlemi seçiniz: ");
        System.out.println("Kan basıncı ölçümü için 1'i,");
        System.out.println("Kilo ölçümü için 2'yi,");
        System.out.println("Uyku takibi ölçümü için 3'ü,");
        System.out.println("Adım sayınızın takibi için 4'ü seçiniz.");

        int secim=klavye.nextInt();

        switch (secim){
            case 1:
                System.out.println("Kan basıncı ölçümü");
                break;

            case 2:
                System.out.println("Kilo ölçümü");
                Olcum.Kilo kilo= new Olcum.Kilo("30.12.2023");
                kilo.degerGir();


                System.out.println("Birim: " + kilo.getBirim());
                System.out.println("Olcum Degeri: " + kilo.degerToString());



                break;

            case 3:
                System.out.println("Uyku takibi ölçümü");
                UykuTakibi uykuTakibi= new UykuTakibi();
                uykuTakibi.uykuVerisiGir();
                uykuTakibi.uykuSuresiGoster();
                uykuTakibi.uykuKalitesiGoster();
                break;

            case 4:
                System.out.println("Adım sayısı ölçümü");
                AdimSayar adimSayar= new AdimSayar();
                adimSayar.degerGir();
                adimSayar.bilgileriGoster();
                break;

            default:
                System.out.println("Geçersiz seçim yaptınız.");
                break;


        }









    }
}