import java.util.Scanner;
public abstract class Olcum {

    //degisken tanimlama
    private String olcumAdi;
    private String birim;
    private String tarih;


    //constructor tanimlama
    public Olcum(String olcumAdi, String birim, String tarih) {
        this.olcumAdi = olcumAdi;
        this.birim = birim;
        this.tarih = tarih;
    }

    //kan basinci degerlerini girme
    public abstract void degerGir();






    public abstract String getBirim();


    //degerleri string e donusturme

    public abstract String degerToString();

    public void olcumBilgileriniAl() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lutfen olcum bilgilerinizi giriniz: ");

        System.out.println("Olcum adini giriniz: ");
        this.olcumAdi = klavye.nextLine();

        System.out.println("Birimi giriniz: ");
        this.birim = klavye.nextLine();

        System.out.println("Tarih giriniz: ");
        this.tarih = klavye.nextLine();


    }


    //ic ice kanbasinci olcum sinifi
    public static class KanBasinci extends Olcum {


        //buyuktansiyon olcumu
        private int sistolik;


        //kucuktansiyon olcumu
        private int diastolik;


        // Yapilandirici olusturma
        public KanBasinci(String tarih) {
            super("Kan Basıncı", "mmHg", tarih);
        }

        public void degerGir() {
            Scanner klavye = new Scanner(System.in);
            System.out.print("Sistolik Değerini Giriniz: ");
            this.sistolik = klavye.nextInt();

            System.out.print("Diastolik Değerini Giriniz: ");
            this.diastolik = klavye.nextInt();


        }
        public String getBirim() {
            return "mmHg";
        }

        //kan basinci degerlerini string olarak dondurme
        public String degerToString() {
            return "Sistolik: " + this.sistolik + " " + this.getBirim() + ", Diastolik: " + this.diastolik + " " + this.getBirim();
        }

    }

    //ic ice kilo olcum sinifi
    public static class Kilo extends Olcum {
        private double kilo;

        // Yapilandirici
        public Kilo(String tarih) {
            super("Kilo", "kg", tarih);
        }


        // Kilo değerini girme
        public void degerGir() {
            Scanner klavye = new Scanner(System.in);

            try {
                System.out.print("Kilo değerinizi giriniz: ");
                double girilenKilo = klavye.nextDouble();

                // girilen kilonun negatif olma durumunu kontrol etme
                if (girilenKilo < 0) {
                    throw new IllegalArgumentException("Girilen kilo değeri negatif olamaz.");
                }

                this.kilo = girilenKilo;
            } catch (Exception e) {
                System.out.println("Hata: " + e.getMessage());

            }

        }

        public String getBirim() {
            return "kg";
        }

        // Kilo değerini string olarak döndürme
        public String degerToString() {
            return "Kilo: " + this.kilo + " " + this.getBirim();
        }
    }

}