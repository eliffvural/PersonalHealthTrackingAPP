import java.util.Scanner;

public class AdimSayar {

        private int adimSayisi;


        //constructor tanimlama
        public AdimSayar() {
            this.adimSayisi = adimSayisi;
        }

        public void degerGir() {
            Scanner klavye = new Scanner(System.in);
            System.out.print("Günlük adım sayısını giriniz: ");
            this.adimSayisi = klavye.nextInt();
        }

        public void bilgileriGoster(){
            System.out.println("Günlük adım sayınız: "+this.adimSayisi);

            //yakilanKalori=adimSayisi*adim basina dusen kalori miktari(ort 0.05)

            double yakilanKalori=0;
            yakilanKalori=adimSayisi*0.05;

            System.out.println("Günlük ortalama yaktığınız kalori miktarı: "+yakilanKalori);


        }

}
