public class Kullanici {


    //degisken tanimlama
    private String ad;
    private String soyad;
    private int yas;
    private String email;


    // constructor tanimlama
    public Kullanici(String ad, String soyad,String email ,int yas ) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.email = email;
    }

    // getter ve setter metotlari tanimlama
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // kullanici bilgilerini gosterdigimiz metotlari tanimlama
    //ayni isimde fakat farkli parametrelere sahip iki metot olusturarak overloading olusturma
    public void bilgileriGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
        System.out.println("E-mail: " + this.email);
    }

    public void bilgileriGoster(String ad, String soyad, int yas, String email) {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
        System.out.println("E-mail: " + this.email);

    }


}
