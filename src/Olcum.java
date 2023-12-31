import java.util.Scanner;

public abstract class Olcum {
    private String olcumAdi;
    private String birim;
    private String tarih;

    //constructor tanimlama
    public Olcum(String olcumAdi, String birim) {
        this.olcumAdi = olcumAdi;
        this.birim = birim;
    }

    //abstract metotlari tanimlama
    public abstract void degerGir();
    public abstract String degerToString();
    public abstract String getBirim();

    //kullanicidan olcum bilgilerini alma metodu
    public void olcumBilgileriniAl() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen ölçüm bilgilerinizi giriniz: ");


            System.out.print("Ölçüm adını giriniz: ");
            this.olcumAdi = klavye.nextLine();

            System.out.print("Birimi giriniz: ");
            this.birim = klavye.nextLine();

            System.out.print("Tarih giriniz: ");
            this.tarih = klavye.nextLine();
        }


    //getter metotlari
    public String getOlcumAdi() {
        return olcumAdi;
    }

    public String getTarih() {
        return tarih;
    }

    //ic ice classlar

    //kanbasinci sinifi tanimlama

    public static class KanBasinci extends Olcum {
        private int sistolik;
        private int diastolik;

        //constructor tanimlama
        public KanBasinci() {
            super("Kan Basıncı", "mmHg");
        }

        //ayni isimde fakat farklı parametrelere sahip--overloading
        //kan basinci degerlerini kullanicidan alma metodu
        public void degerGir() {
            Scanner klavye = new Scanner(System.in);
            System.out.print("Sistolik Değeri Giriniz: ");
            this.sistolik = klavye.nextInt();

            System.out.print("Diastolik Değeri Giriniz: ");
            this.diastolik = klavye.nextInt();
        }

        //kan basinci degerlerini kullanicidan parametre ile alma metodu
        public void degerGir(int sistolik, int diastolik) {
            Scanner klavye = new Scanner(System.in);

            System.out.print("Sistolik Değeri Giriniz: ");
            this.sistolik = klavye.nextInt();

            System.out.print("Diastolik Değeri Giriniz: ");
            this.diastolik = klavye.nextInt();


        }

        public void sistolikDurum(){
            if(sistolik>=0 && sistolik<120){
                System.out.println("Sistolik değeriniz ortalamanın altındadır.");
                System.out.println("");
                System.out.println("--Öneriler--");
                System.out.println("Bol su tüketin. Günde 8 ila 10 su bardağı su tüketilmesi gerekmektedir.");
                System.out.println("Tuz tüketimini artırın.");

            }
            else if (sistolik>=120 && sistolik<130) {
                System.out.println("Sistolik değeriniz ortalama seviyededir.");
            }
            else if (sistolik>=130) {
                System.out.println("Sistolik değeriniz ortalamanın üzerindedir.");


            }

        }


        public void diastolikDurum(){

            if(diastolik>=0 && diastolik<70){
                System.out.println("Diastolik değeriniz ortalamanın altındadır.");
                System.out.println("");
                System.out.println("--Öneriler--");
                System.out.println("Bol su tüketin. Günde 8 ila 10 su bardağı su tüketilmesi gerekmektedir.");
                System.out.println("Sık sık küçük öğünler tüketin");

            }
            else if (diastolik>=70 && diastolik<90) {
                System.out.println("Diastolik değeriniz ortalama seviyededir.");
            }
            else if (diastolik>=90) {
                System.out.println("Diastolik değeriniz ortalamanın üzerindedir.");


            }

        }



        public String getBirim() {
            return "mmHg";
        }

        public String degerToString() {
            return "Sistolik: " + this.sistolik + " " + this.getBirim() + ", Diastolik: " + this.diastolik + " " + this.getBirim();
        }
    }



    //kilo sinifi
    public static class Kilo extends Olcum {
        private double kilo;

        //constructor tanimlama
        public Kilo() {
            super("Kilo", "kg");
        }

        //kilo degerini kullanicidan alma metodu
        //girilen kilo bilgisinin negatif olma durumuna gore try catch
        public void degerGir() {
            Scanner klavye = new Scanner(System.in);

            try {
                System.out.print("Kilo değerinizi giriniz: ");
                double girilenKilo = klavye.nextDouble();

                if (girilenKilo < 0) {
                    throw new IllegalArgumentException("Girilen kilo değeri negatif olamaz.");
                }

                this.kilo = girilenKilo;
            } catch (Exception e) {
                System.out.println("Hata: Geçersiz bir değer girdiniz. Kilo değeri belirlenemedi.");
                System.exit(0); // Programı sonlandır
            }
        }


        public String getBirim() {
            return "kg";
        }

        public String degerToString() {
            return "Kilo: " + this.kilo + " " + this.getBirim();
        }
    }

}
