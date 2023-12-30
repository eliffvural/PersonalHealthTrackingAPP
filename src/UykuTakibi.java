import java.util.Scanner;

public class UykuTakibi {

    private int uykuSuresi;
    private int uykuKalitesi;

    // constructor tanimlama
    public UykuTakibi() {
        this.uykuSuresi = uykuSuresi;
        this.uykuKalitesi = uykuKalitesi;

    }



    // kullanicinin giris yapmasi icin metot
    public void uykuVerisiGir() {
        Scanner klavye = new Scanner(System.in);


        System.out.print("Uyku süresinizi saat cinsinden giriniz: ");
        this.uykuSuresi = klavye.nextInt();

        System.out.print("Uyku kalitenizi 1-5 arasinda puanlayınız: ");
        this.uykuKalitesi = klavye.nextInt();

    }

    //overloading ile genisletilmis metot
    //overloading ile ayni isme sahip farkli parametreleri tanimlayabiliriz
    public void uykuVerisiGir(int uykuSuresi, int uykuKalitesi) {
        this.uykuSuresi = uykuSuresi;
        this.uykuKalitesi = uykuKalitesi;
    }



    // kullanicinin girdigi verileri gostermek icin metot

    public void uykuSuresiGoster(){

        System.out.println("Bugünkü uyku süreniz: "+this.uykuSuresi+" saat");
        if (uykuSuresi>=0 && uykuSuresi<7){
            System.out.println("Uyku süreniz ortalamanın altındadır. Günlük uyumanız gereken saat 7-8 saattir. Uyku sürenizi arttırmaya özen gösteriniz.");
        }
        else if(uykuSuresi>=7 && uykuSuresi<9){
            System.out.println("Günlük uyku süreniz idealdir.");
        }
        else if(uykuSuresi>=9 && uykuSuresi<24){
            System.out.println("Günlük uyku süreniz ortalamanın üstündedir.");
        }
        else{
            System.out.println("Girilen uyku değeri geçersizdir.");
        }
    }

    public void uykuKalitesiGoster(){

        if (uykuKalitesi>0 && uykuKalitesi<3){
            System.out.println("Uyku kaliteniz düşük-orta seviyede.");
            System.out.println("Kafeinden kaçının: Uyumadan 8-10 saat önce kafein alımını kesmek kaliteli bir uyku için gerekli.");
            System.out.println("Parlak aydınlatmalardan uzak durun: Akşam 10 ile sabah 4 arasında parlak aydınlatmalarından uzak durun. Yapay aydınlatmalar melatonin salgılanma düzenini etkileyerek sirkadiyen ritimde bozulmalara neden oluyor.");
        } else if (uykuKalitesi>=3 && uykuKalitesi<=5) {
            System.out.println("Uyku kaliteniz yüksek seviyede.");

        }else{
            System.out.println("Geçersiz tuşlama yaptınız.");
        }

    }
}
